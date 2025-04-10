package com.example.proyecto_mongodb_spring.service;


import com.example.proyecto_mongodb_spring.dto.Busqueda;
import com.example.proyecto_mongodb_spring.dto.EventoDTO;
import com.example.proyecto_mongodb_spring.entity.Evento;
import com.example.proyecto_mongodb_spring.repository.EventoRepository;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class EventoService {


    private final EventoRepository eventoRepository;
    private final ArtistaService artistaService;

    public Evento save(Evento evento) {
        return eventoRepository.save(evento);
    }

    public List<EventoDTO> getAllEventos() {
        List<Evento> eventos = eventoRepository.findAll();
        List<EventoDTO> eventosDTO = new ArrayList();
        for (Evento evento : eventos) {
            EventoDTO eventoDTO = new EventoDTO(evento);
            eventoDTO.setArtistas(artistaService.findAllById(evento.getArtistas()));
            eventosDTO.add(eventoDTO);
        }
        return eventosDTO;
    }

    public List<Evento> getByBusqueda(Busqueda nombre) {
        if (nombre.getNombreBusqueda() != null && nombre.getFechaBusqueda() != null && nombre.getArtistaBusqueda() != null) {
            String[] fecha = nombre.getFechaBusqueda().split("/");
            String artistaId = artistaService.getArtistaIdByNombre(nombre.getArtistaBusqueda()).getId();
            return eventoRepository.findByNombreAndFecha_DayAndFecha_MonthAndFecha_YearAndArtista(nombre.getNombreBusqueda(), Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]), artistaId);
        } else if (nombre.getNombreBusqueda() != null && nombre.getFechaBusqueda() != null) {
            String[] fecha = nombre.getFechaBusqueda().split("/");
            return eventoRepository.findByNombreAndFecha_DayAndFecha_MonthAndFecha_Year(nombre.getNombreBusqueda(), Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]));
        } else if (nombre.getNombreBusqueda() != null && nombre.getArtistaBusqueda() != null) {
            String artistaId = artistaService.getArtistaIdByNombre(nombre.getArtistaBusqueda()).getId();
            return eventoRepository.findByNombreAndArtista(nombre.getNombreBusqueda(), artistaId);
        } else if (nombre.getFechaBusqueda() != null && nombre.getArtistaBusqueda() != null) {
            String[] fecha = nombre.getFechaBusqueda().split("/");
            String artistaId = artistaService.getArtistaIdByNombre(nombre.getArtistaBusqueda()).getId();
            return eventoRepository.findByFecha_DayAndFecha_MonthAndFecha_YearAndArtista(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]), artistaId);
        } else if (nombre.getNombreBusqueda() != null) {
            return eventoRepository.findByNombre(nombre.getNombreBusqueda());
        } else if (nombre.getFechaBusqueda() != null) {
            String[] fecha = nombre.getFechaBusqueda().split("/");
            return eventoRepository.findByFecha_DayAndFecha_MonthAndFecha_Year(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]));
        } else if (nombre.getArtistaBusqueda() != null) {
            String artistaId = artistaService.getArtistaIdByNombre(nombre.getArtistaBusqueda()).getId();
            return eventoRepository.findByArtista(artistaId);
        }
        return null;
    }

    public void delete(Evento evento) {
        eventoRepository.delete(evento);
    }
}

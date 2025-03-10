package com.example.proyecto_mongodb_spring.controller;

import com.example.proyecto_mongodb_spring.dto.Busqueda;
import com.example.proyecto_mongodb_spring.dto.EventoDTO;
import com.example.proyecto_mongodb_spring.entity.Evento;
import com.example.proyecto_mongodb_spring.service.EventoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/evento")
public class EventoController {

    private final EventoService eventoService;

    @GetMapping
    public List<EventoDTO> getEventos() {
        return eventoService.getAllEventos();
    }

    @GetMapping("/busqueda")
    public List<Evento> getEventosByBusqueda(Busqueda busqueda) {
        return eventoService.getByBusqueda(busqueda);
    }

    @PostMapping
    public Evento saveEvento(Evento evento) {
        return eventoService.save(evento);
    }

    @PutMapping
    public Evento updateEvento(Evento evento) {
        return eventoService.save(evento);
    }

    @DeleteMapping
    public void deleteEvento(Evento evento) {
        eventoService.delete(evento);
    }

}

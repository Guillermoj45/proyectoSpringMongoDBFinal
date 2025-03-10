package com.example.proyecto_mongodb_spring.dto;

import com.example.proyecto_mongodb_spring.entity.Artista;
import com.example.proyecto_mongodb_spring.entity.Evento;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Data
@Getter
@Setter
public class EventoDTO {
    private String id;

    private String nombre;

    private LocalDate fecha;

    private LocalTime hora;

    private String lugar;

    private Set<Artista> artistas;

    private Float precio;

    public EventoDTO(Evento evento) {
        this.id = evento.getId();
        this.nombre = evento.getNombre();
        this.fecha = evento.getFecha();
        this.hora = evento.getHora();
        this.lugar = evento.getLugar();
        this.precio = evento.getPrecio();
    }
}

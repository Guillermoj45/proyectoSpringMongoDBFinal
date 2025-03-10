package com.example.proyecto_mongodb_spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Evento {

    @Id
    private String id;

    private String nombre;

    private LocalDate fecha;

    private LocalTime hora;

    private String lugar;

    @Indexed
    private Set<String> artistas;

    private Float precio;

}

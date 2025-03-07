package com.example.proyecto_mongodb_spring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Entrada {
    @Id
    private ObjectId id;

    private ObjectId Evento;

    private String nombreComprador;

    private boolean estado;

}

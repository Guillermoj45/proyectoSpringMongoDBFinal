package com.example.proyecto_mongodb_spring.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.HashMap;

@Data
@Document(collection = "artista")
@AllArgsConstructor
@NoArgsConstructor
public class Artista {

    @Id
    private ObjectId id;

    @Field("nombre")
    private String nombre;

    @Field("genero")
    private String genero;

    @Field("biografia")
    private String biografia;

    @Field("enlacesEnRedes")
    private HashMap<String, String> enlacesEnRedes;

    @Override
    public String toString() {
        return "Artista{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", biografia='" + biografia + '\'' +
                ", enlacesEnRedes=" + enlacesEnRedes +
                '}';
    }
}

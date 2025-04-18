package com.example.proyecto_mongodb_spring.entity;

import com.example.proyecto_mongodb_spring.dto.RedesSocioales;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.HashMap;

@Data
@Document(collection = "artista")
@AllArgsConstructor
@NoArgsConstructor
public class Artista {

    @Id
    private String id;

    @Field("nombre")
    @Indexed
    private String nombre;

    @Field("genero")
    @Indexed
    private String genero;

    @Field("biografia")
    private String biografia;

    @Field("enlacesEnRedes")
    private RedesSocioales[] enlacesEnRedes;

}

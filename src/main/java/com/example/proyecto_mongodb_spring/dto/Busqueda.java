package com.example.proyecto_mongodb_spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Busqueda {
    private String nombreBusqueda;
    private String fechaBusqueda;
    private String ArtistaBusqueda;
}

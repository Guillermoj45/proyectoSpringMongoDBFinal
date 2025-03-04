package com.example.proyecto_mongodb_spring.controller;

import com.example.proyecto_mongodb_spring.entity.Artista;
import com.example.proyecto_mongodb_spring.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/artista")
public class ArtistaController {
    @Autowired
    private ArtistaService artistaService;

    @PostMapping
    public Artista addArtista(@RequestBody HashMap<String,String> artista) {
        System.out.println("Datos recibidos: " + artista);
        return null;
        //return artistaService.save(artista);
    }
}

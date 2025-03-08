package com.example.proyecto_mongodb_spring.controller;

import com.example.proyecto_mongodb_spring.entity.Artista;
import com.example.proyecto_mongodb_spring.service.ArtistaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/artista")
@AllArgsConstructor
public class ArtistaController {
    private ArtistaService artistaService;

    @PostMapping
    public Artista addArtista(@RequestBody Artista artista) {

        return artistaService.save(artista);
    }

    @GetMapping()
    public Iterable<Artista> getArtistas() {
        return artistaService.findAll();
    }

    @PutMapping()
    public Artista updateArtista(@RequestBody Artista artista) {
        return artistaService.save(artista);
    }
}

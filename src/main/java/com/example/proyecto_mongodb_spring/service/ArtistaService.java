package com.example.proyecto_mongodb_spring.service;

import com.example.proyecto_mongodb_spring.entity.Artista;
import com.example.proyecto_mongodb_spring.repository.ArtistaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistaService {
    @Autowired
    private ArtistaRepository artistaRepository;

    public Artista save(Artista artista) {
        return artistaRepository.save(artista);
    }
}

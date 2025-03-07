package com.example.proyecto_mongodb_spring.service;

import com.example.proyecto_mongodb_spring.entity.Artista;
import com.example.proyecto_mongodb_spring.repository.ArtistaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ArtistaService {
    private ArtistaRepository artistaRepository;

    public Artista save(Artista artista) {

        return artistaRepository.save(artista);
    }

    public void delete(Artista artista) {
        artistaRepository.delete(artista);
    }

    public List<Artista> findAll() {
        return artistaRepository.findAll();
    }
}

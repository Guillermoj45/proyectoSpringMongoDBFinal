package com.example.proyecto_mongodb_spring.service;

import com.example.proyecto_mongodb_spring.entity.Artista;
import com.example.proyecto_mongodb_spring.repository.ArtistaRepository;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import org.springframework.validation.ObjectError;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public Artista getArtistaIdByNombre(String artistaBusqueda) {
        return artistaRepository.findByNombre(artistaBusqueda);
    }

    public Artista findById(String id) {
        return artistaRepository.findById(id).orElse(null);
    }

    public Set<Artista> findAllById(Set<String> artistas) {
        return new HashSet<>(artistaRepository.findAllById(artistas));
    }
}

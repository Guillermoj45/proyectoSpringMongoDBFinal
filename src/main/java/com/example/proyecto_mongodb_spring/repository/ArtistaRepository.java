package com.example.proyecto_mongodb_spring.repository;

import com.example.proyecto_mongodb_spring.entity.Artista;
import com.mongodb.internal.operation.AbortTransactionOperation;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistaRepository extends MongoRepository<Artista, String> {
    public Artista findByNombre(String nombre);
    public List<Artista> findByGenero(String genero);
}

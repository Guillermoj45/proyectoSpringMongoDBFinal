package com.example.proyecto_mongodb_spring.repository;

import com.example.proyecto_mongodb_spring.entity.Artista;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends MongoRepository<Artista, ObjectId> {
}

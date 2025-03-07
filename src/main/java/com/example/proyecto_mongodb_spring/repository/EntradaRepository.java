package com.example.proyecto_mongodb_spring.repository;

import com.example.proyecto_mongodb_spring.entity.Entrada;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntradaRepository extends MongoRepository<Entrada, ObjectId> {
    public Integer countEntradaByEvento(ObjectId evento);
}

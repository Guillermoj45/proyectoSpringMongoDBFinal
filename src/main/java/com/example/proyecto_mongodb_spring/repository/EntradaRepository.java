package com.example.proyecto_mongodb_spring.repository;

import com.example.proyecto_mongodb_spring.entity.Entrada;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntradaRepository extends MongoRepository<Entrada, ObjectId> {
    public Integer countEntradaByEvento(ObjectId evento);

    Object getById(ObjectId entrada);
}

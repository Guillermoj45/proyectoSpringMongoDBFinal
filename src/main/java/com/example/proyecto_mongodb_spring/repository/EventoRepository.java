package com.example.proyecto_mongodb_spring.repository;

import com.example.proyecto_mongodb_spring.entity.Evento;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface EventoRepository extends MongoRepository<Evento, ObjectId> {
    public Evento findByNombre(String nombre);

    List<Evento> findByFecha_DayAndFecha_MonthAndFecha_Year(int day, int month, int year);

    @Query("{ 'artistas': ?0 }")
    List<Evento> findByArtista(ObjectId artistaId);
}

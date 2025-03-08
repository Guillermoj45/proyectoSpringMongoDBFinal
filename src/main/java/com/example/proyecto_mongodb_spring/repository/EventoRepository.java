package com.example.proyecto_mongodb_spring.repository;

import com.example.proyecto_mongodb_spring.entity.Evento;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.w3c.dom.ls.LSInput;

import java.util.List;

@Repository
public interface EventoRepository extends MongoRepository<Evento, ObjectId> {
    List<Evento> findByNombre(String nombre);

    List<Evento> findByFecha_DayAndFecha_MonthAndFecha_Year(int day, int month, int year);

    @Query("{ 'artistas': ?0 }")
    List<Evento> findByArtista(ObjectId artistaId);

    @Query("{ 'nombre': ?0, 'fecha.day': ?1, 'fecha.month': ?2, 'fecha.year': ?3, 'artistas': ?4 }")
    List<Evento> findByNombreAndFecha_DayAndFecha_MonthAndFecha_YearAndArtista(String nombre, int day, int month, int year, ObjectId artistaId);

    @Query("{ 'nombre': ?0, 'fecha.day': ?1, 'fecha.month': ?2, 'fecha.year': ?3 }")
    List<Evento> findByNombreAndFecha_DayAndFecha_MonthAndFecha_Year(String nombre, int day, int month, int year);

    @Query("{ 'fecha.day': ?0, 'fecha.month': ?1, 'fecha.year': ?2, 'artistas': ?3 }")
    List<Evento> findByFecha_DayAndFecha_MonthAndFecha_YearAndArtista(int day, int month, int year, ObjectId artistaId);

    @Query("{ 'nombre': ?0, 'artistas': ?1 }")
    List<Evento> findByNombreAndArtista(String nombreBusqueda, ObjectId artistaId);
}

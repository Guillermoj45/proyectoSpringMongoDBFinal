package com.example.proyecto_mongodb_spring.service;

import com.example.proyecto_mongodb_spring.entity.Entrada;
import com.example.proyecto_mongodb_spring.repository.EntradaRepository;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EntradaService {

    private final EntradaRepository entradaRepository;

    public List<Entrada> getAllEntradas() {
        return entradaRepository.findAll();
    }

    public Integer countEntradaByEvento(ObjectId evento) {
        return entradaRepository.countEntradaByEvento(evento);
    }

    public void anularEntrada(ObjectId entrada) {
        entradaRepository.getById(entrada);
    }

    public Entrada saveEntrada(Entrada entrada) {
        return entradaRepository.save(entrada);
    }
}

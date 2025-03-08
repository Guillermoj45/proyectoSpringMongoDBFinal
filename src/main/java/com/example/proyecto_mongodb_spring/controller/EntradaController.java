package com.example.proyecto_mongodb_spring.controller;

import com.example.proyecto_mongodb_spring.entity.Entrada;
import com.example.proyecto_mongodb_spring.service.EntradaService;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/entrada")
@AllArgsConstructor
public class EntradaController {

    private final EntradaService entradaService;

    @GetMapping
    public List<Entrada> getEntradas() {
        return entradaService.getAllEntradas();
    }

    @PostMapping("/anular")
    public void anularEntrada(ObjectId entrada) {
        entradaService.anularEntrada(entrada);
    }

}

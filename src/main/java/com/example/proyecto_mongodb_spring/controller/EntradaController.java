package com.example.proyecto_mongodb_spring.controller;

import com.example.proyecto_mongodb_spring.entity.Entrada;
import com.example.proyecto_mongodb_spring.service.EntradaService;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Entrada saveEntrada(Entrada entrada) {
        return entradaService.saveEntrada(entrada);
    }

    @PutMapping("/anular")
    public void anularEntrada(ObjectId entrada) {
        entradaService.anularEntrada(entrada);
    }

}

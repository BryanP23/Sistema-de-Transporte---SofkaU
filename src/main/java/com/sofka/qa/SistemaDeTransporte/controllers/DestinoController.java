package com.sofka.qa.SistemaDeTransporte.controllers;

import com.sofka.qa.SistemaDeTransporte.models.Destino;
import com.sofka.qa.SistemaDeTransporte.services.DestinoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/destinos")
public class DestinoController {
    private DestinoService destinoService;

    public DestinoController(DestinoService destinoService) {
        this.destinoService = destinoService;
    }

    @GetMapping
    public List<Destino> getDestinos() {
        return destinoService.getDestinos();
    }

    @PostMapping
    public void addDestino(@RequestBody Destino destino) {
        destinoService.addDestino(destino);
    }
}

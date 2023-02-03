package com.sofka.qa.SistemaDeTransporte.controllers;

import com.sofka.qa.SistemaDeTransporte.models.Viaje;
import com.sofka.qa.SistemaDeTransporte.services.ViajeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
    @RestController
    @RequestMapping("/viajes")
    public class ViajeController {
        private ViajeService viajeService;

        public ViajeController(ViajeService viajeService) {
            this.viajeService = viajeService;
        }

        @GetMapping
        public List<Viaje> getViajes() {
            return viajeService.getViajes();
        }

        @PostMapping
        public void addViaje(@RequestBody Viaje viaje) {
            viajeService.addViaje(viaje);
        }
    }

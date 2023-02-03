package com.sofka.qa.SistemaDeTransporte.services;

import com.sofka.qa.SistemaDeTransporte.models.Viaje;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ViajeService {
    private List<Viaje> viajes;

    public ViajeService() {
        this.viajes = new ArrayList<>();
    }

    public List<Viaje> getViajes() {
        return viajes;
    }

    public void addViaje(Viaje viaje) {
        viajes.add(viaje);
    }
}

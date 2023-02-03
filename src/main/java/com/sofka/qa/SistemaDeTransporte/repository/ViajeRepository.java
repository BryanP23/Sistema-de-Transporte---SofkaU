package com.sofka.qa.SistemaDeTransporte.repository;

import com.sofka.qa.SistemaDeTransporte.models.Viaje;

import java.util.List;

public interface ViajeRepository {

    List<Viaje> getViaje();
    void addTrip(Viaje viaje);
}

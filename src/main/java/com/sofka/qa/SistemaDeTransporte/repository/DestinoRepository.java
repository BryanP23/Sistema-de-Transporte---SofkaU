package com.sofka.qa.SistemaDeTransporte.repository;

import com.sofka.qa.SistemaDeTransporte.models.Destino;

import java.util.List;

public interface DestinoRepository {

    List<Destino> getDestinations();
    void addDestination(Destino destino);
}

package com.sofka.qa.SistemaDeTransporte.repository;

import com.sofka.qa.SistemaDeTransporte.models.Bus;

import java.util.List;

public interface BusRepository {

    List<Bus> getBuses();
    void addBus(Bus bus);
}

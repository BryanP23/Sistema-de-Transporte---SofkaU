package com.sofka.qa.SistemaDeTransporte.services;



import com.sofka.qa.SistemaDeTransporte.models.Bus;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service

public class BusService {
    private List<Bus> buses;

    public BusService() {
        this.buses = new ArrayList<>();
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void addBus(Bus bus) {
        buses.add(bus);
    }
}

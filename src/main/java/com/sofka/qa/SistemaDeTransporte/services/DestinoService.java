package com.sofka.qa.SistemaDeTransporte.services;

import com.sofka.qa.SistemaDeTransporte.models.Destino;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DestinoService {
    private List<Destino> destinos;

    public DestinoService() {
        this.destinos = new ArrayList<>();
    }

    public List<Destino> getDestinos() {
        return destinos;
    }

    public void addDestino(Destino destino) {
        destinos.add(destino);
    }
}

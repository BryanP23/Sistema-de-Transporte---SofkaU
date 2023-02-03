package com.sofka.qa.SistemaDeTransporte.models;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Viaje {
    private int id;
    private Destino destino;
    private Bus bus;
    private Map<Integer, Pasajero> pasajeros;

    public Viaje (int id, Destino destino, Bus bus) {
        this.id = id;
        this.destino = destino;
        this.bus = bus;
        this.pasajeros = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Map<Integer, Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Map<Integer, Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }
}

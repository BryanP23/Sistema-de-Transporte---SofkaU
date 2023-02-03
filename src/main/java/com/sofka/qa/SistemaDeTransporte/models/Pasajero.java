package com.sofka.qa.SistemaDeTransporte.models;

public class Pasajero {

    private int id;
    private String name;
    private String personalData;

    public Pasajero (int id, String name, String personalData) {
        this.id = id;
        this.name = name;
        this.personalData = personalData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalData() {
        return personalData;
    }

    public void setPersonalData(String personalData) {
        this.personalData = personalData;
    }
}

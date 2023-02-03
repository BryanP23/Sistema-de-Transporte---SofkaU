package com.sofka.qa.SistemaDeTransporte.controllers;

import com.sofka.qa.SistemaDeTransporte.models.Bus;
import com.sofka.qa.SistemaDeTransporte.services.BusService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Repository
@RestController
@RequestMapping("/buses")
public class BusController {
    private BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @GetMapping
    public List<Bus> getBuses() {
        return busService.getBuses();
    }

    @PostMapping
    public void addBus(@RequestBody Bus bus) {
        busService.addBus(bus); }
}
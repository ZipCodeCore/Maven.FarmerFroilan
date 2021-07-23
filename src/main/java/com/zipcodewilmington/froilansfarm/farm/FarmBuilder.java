package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.vehicle.Vehicle;

import java.util.List;

public class FarmBuilder {

    private List<FarmHouse> farmhouses;
    private List<Stable> stables;
    private List<ChickenCoop> chickenCoops;
    private List<Field> fields;
    private List<Vehicle> vehicles;

    public FarmBuilder setFarmhouses(List<FarmHouse> farmhouses) {
        this.farmhouses = farmhouses;
        return this;
    }

    public FarmBuilder setStables(List<Stable> stables) {
        this.stables = stables;
        return this;
    }

    public FarmBuilder setChickenCoops(List<ChickenCoop> chickenCoops) {
        this.chickenCoops = chickenCoops;
        return this;
    }

    public FarmBuilder setFields(List<Field> fields) {
        this.fields = fields;
        return this;
    }

    public FarmBuilder setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
        return this;
    }

    public Farm build() {
        return new Farm(farmhouses, stables, chickenCoops, fields, vehicles);
    }
}
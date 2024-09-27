package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.vehicle.Vehicle;

import java.util.List;

public class Farm {

    List<FarmHouse> farmhouses;
    List<Stable> stables;
    List<ChickenCoop> chickenCoops;
    List<Field> fields;
    List<Vehicle> vehicles;

    public Farm(List<FarmHouse> farmhouses, List<Stable> stables, List<ChickenCoop> chickenCoops, List<Field> fields, List<Vehicle> vehicles) {
        this.farmhouses = farmhouses;
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.fields = fields;
        this.vehicles = vehicles;
    }

    public List<FarmHouse> getFarmhouses() {
        return farmhouses;
    }

    public List<Stable> getStables() {
        return stables;
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public List<Field> getFields() {
        return fields;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

}


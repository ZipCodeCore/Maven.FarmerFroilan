package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.vehicle.Vehicle;

import java.util.*;

public class FarmBuilder {

    private List<FarmHouse> farmhouses;
    private List<Stable> stables;
    private List<ChickenCoop> chickenCoops;
    private List<Field> fields;
    private List<Vehicle> vehicles;

    public FarmBuilder setFarmhouses(FarmHouse farmhouses) {
        this.farmhouses = new ArrayList<>(Arrays.asList(farmhouses));
        return this;
    }

    public FarmBuilder setStables(Stable... stables) {
        this.stables = new ArrayList<>(Arrays.asList(stables));
        return this;
    }

    public FarmBuilder setChickenCoops(ChickenCoop... chickenCoops) {
        this.chickenCoops = new ArrayList<>(Arrays.asList(chickenCoops));
        return this;
    }

    public FarmBuilder setFields(Field... fields) {
        this.fields = new ArrayList<>(Arrays.asList(fields));
        return this;
    }

    public FarmBuilder setVehicles(Vehicle... vehicles) {
        this.vehicles = new ArrayList<>(Arrays.asList(vehicles));
        return this;
    }

    public Farm build() {
        return new Farm(farmhouses, stables, chickenCoops, fields, vehicles);
    }
}
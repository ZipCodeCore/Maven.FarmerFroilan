package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
import com.zipcodewilmington.froilansfarm.vehicle.Vehicle;

import java.util.*;

public class FarmBuilder {

    private List<FarmHouse> farmhouses;
    private List<Stable> stables;
    private List<ChickenCoop> chickenCoops;
    private List<Field> fields;
    private List<Tractor> tractors;
    private List<CropDuster> cropDusters;

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

    public FarmBuilder setCropDusters(CropDuster... cropDusters) {
        this.cropDusters = new ArrayList<>(Arrays.asList(cropDusters));
        return this;
    }

    public FarmBuilder setTractors(Tractor... tractors) {
        this.tractors = new ArrayList<>(Arrays.asList(tractors));
        return this;
    }

    public Farm build() {
        return new Farm(farmhouses, stables, chickenCoops, fields, cropDusters, tractors);
    }
}
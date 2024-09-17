package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
import com.zipcodewilmington.froilansfarm.vehicle.Vehicle;

import java.util.List;

public class Farm {

    List<FarmHouse> farmhouses;
    List<Stable> stables;
    List<ChickenCoop> chickenCoops;
    List<Field> fields;
    List<CropDuster> cropDusters;
    List<Tractor> tractors;

    public Farm(List<FarmHouse> farmhouses, List<Stable> stables, List<ChickenCoop> chickenCoops, List<Field> fields, List<CropDuster> cropDusters, List<Tractor> tractors) {
        this.farmhouses = farmhouses;
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.fields = fields;
        this.cropDusters = cropDusters;
        this.tractors = tractors;
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

    public List<CropDuster> getCropDusters() {
        return cropDusters;
    }

    public List<Tractor> getTractors() {
        return tractors;
    }
}


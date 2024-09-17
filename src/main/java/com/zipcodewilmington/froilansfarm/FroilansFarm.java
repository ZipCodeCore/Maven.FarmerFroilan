package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.crops.PotatoRoot;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.farm.*;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;

public class FroilansFarm {

    private static Farm farm;

    private FroilansFarm() {
    }

    public static Farm getInstance() {
        if (farm == null) {
            farm = buildFarm();
            return farm;
        }
        return farm;
    }

    private static Farm buildFarm() {
        FarmBuilder builder = new FarmBuilder();
        Farm farm = builder
                .setFarmhouses(
                        new FarmHouse())
                .setFields(
                        new Field(new CropRow(),
                                new CropRow(),
                                new CropRow(),
                                new CropRow(),
                                new CropRow()))
                .setStables(
                        new Stable(new Horse(), new Horse(), new Horse()),
                        new Stable(new Horse(), new Horse(), new Horse(), new Horse()),
                        new Stable(new Horse(), new Horse(), new Horse()))
                .setChickenCoops(
                        new ChickenCoop(new Chicken(), new Chicken(), new Chicken(), new Chicken()),
                        new ChickenCoop(new Chicken(), new Chicken(), new Chicken(), new Chicken()),
                        new ChickenCoop(new Chicken(), new Chicken(), new Chicken(), new Chicken()),
                        new ChickenCoop(new Chicken(), new Chicken(), new Chicken()))
                .setTractors(
                        new Tractor(5))
                .setCropDusters(
                        new CropDuster())
                .build();
        return farm;
    }
}

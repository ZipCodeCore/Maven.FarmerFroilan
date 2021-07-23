package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.animals.person.Farmer;
import com.zipcodewilmington.froilansfarm.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.PotatoRoot;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.farm.*;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;

import java.util.ArrayList;
import java.util.Arrays;

public class Froilan extends Farmer {

    FarmBuilder builder = new FarmBuilder();
    Farm farm = builder
            .setFarmhouses(
                    new FarmHouse())
            .setFields(
                    new Field(new CropRow(new CornStalk(true, true)),
                    new CropRow(new TomatoPlant(true, true)),
                    new CropRow(new PotatoRoot(true, true)),
                    new CropRow(new TomatoPlant(true, true)),
                    new CropRow(new PotatoRoot(true, true))))
            .setStables(
                    new Stable(new Horse(), new Horse(), new Horse()),
                    new Stable(new Horse(), new Horse(), new Horse(), new Horse()),
                    new Stable(new Horse(), new Horse(), new Horse()))
            .setChickenCoops(
                    new ChickenCoop(new Chicken(), new Chicken(), new Chicken(), new Chicken()),
                    new ChickenCoop(new Chicken(), new Chicken(), new Chicken(), new Chicken()),
                    new ChickenCoop(new Chicken(), new Chicken(), new Chicken(), new Chicken()),
                    new ChickenCoop(new Chicken(), new Chicken(), new Chicken()))
            .setVehicles(new Tractor(5), new CropDuster())
            .build();

}

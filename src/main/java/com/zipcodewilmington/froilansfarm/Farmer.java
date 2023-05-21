package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.plants.Crop;

public class Farmer extends Person implements Botanist, Rider {

    public Farmer(String name) {
        super(name);
    }

    @Override
    public void plant(CropRow cropRow, Crop crop) {
        cropRow.store(crop);
    }

    @Override
    public String makeNoise() {
        System.out.println("howdy");
        return null;
    }

    @Override
    public void mount(Rideable rideable) {
    }

    @Override
    public void dismount(Rideable rideable) {
    }

    @Override
    public String eat(Edible edible) {
        System.out.println("yum yum");
        return null;
    }

}

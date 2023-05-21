package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.food.Corn;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.plants.Crop;

public class Farmer extends Person implements Botanist, Rider {

    //new changes
    private int cornCount;
    private int tomatoCount;
    private int eggCount;



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


    //new changes
    public void feedHorse(Horse horse, Corn corn) {
        for (int i = 0; i < 3; i++){
            horse.eat(corn);
        }
    }

    public int getCornCount() {
        return cornCount;
    }

    public int getTomatoCount() {
        return tomatoCount;
    }

    public int getEggCount() {
        return eggCount;
    }
}

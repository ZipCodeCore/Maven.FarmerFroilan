package com.zipcodewilmington.froilansfarm.animals;


import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.farm.Produce;

public class Chicken extends Animal implements Produce {
    public String makeNoise() {
        return null;
    }

    @Override
    public void eat(Edible food) {

    }

    @Override
    public Edible yield() {
        return null;
    }

    @Override
    public boolean hasBeenFertilized() {
        return false;
    }
}

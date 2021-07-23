package com.zipcodewilmington.froilansfarm.animals;


import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.farm.Produce;

public class Chicken extends Animal implements Produce {
    public String makeNoise() {
        return null;
    }

    public Boolean eat(Edible food) {

        return null;
    }

    public void yield() {

    }

    public boolean hasBeenFertilized() {

        return false;
    }
}

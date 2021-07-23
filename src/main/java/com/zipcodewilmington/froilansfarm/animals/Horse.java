package com.zipcodewilmington.froilansfarm.animals;


import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.crops.Edible;

public class Horse extends Animal implements Rideable {
    public String makeNoise() {
        return null;
    }

    public void move() {

    }


    @Override
    public void eat(Edible food) {

    }
}

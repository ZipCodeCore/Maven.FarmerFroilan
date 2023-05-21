package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    @Override
    public String eat(Edible edible) {
        System.out.println("munch munch");
        return null;
    }

    @Override
    public String makeNoise() {
        System.out.println("neigh");
        return null;
    }

}

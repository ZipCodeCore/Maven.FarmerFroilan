package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    private String horseMunch ="munch munch";
    private String horseNeigh ="neigh";
    @Override
    public String eat(Edible edible) {
        System.out.println(horseMunch);
        return horseMunch;
    }

    @Override
    public String makeNoise() {
        System.out.println(horseNeigh);
        return horseNeigh;
    }

}

package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.food.EdibleEgg;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce {

    private String chickenPeck ="peck peck";
    private String chickenBuck ="buck buck buckawk";
    public boolean hasBeenFertilized;



    @Override
    public EdibleEgg yield() {
        if(hasBeenFertilized) {
            return new EdibleEgg();
        } else {
            return null;
        }
    }

    @Override
    public String eat(Edible edible) {
        System.out.println(chickenPeck);
        return chickenPeck;
    }


    @Override
    public String makeNoise() {
        System.out.println(chickenBuck);
        return chickenBuck;
    }

}

package com.zipcodewilmington.froilansfarm.Mammal;

//Horse can only eat Earcorn right now
// < Parameter type goes in here, "extends" - limits what the parameter type can be >

import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Mammal.Animal;
import com.zipcodewilmington.froilansfarm.Ridable;

public class Horse extends Animal<EarCorn> implements Ridable {

    public Horse(String name) {
        super(name);
    }

    public Horse() {}

    public void ride() {

    }

    @Override
    public String makeNoise(){
        return "Neigh";
    }
}

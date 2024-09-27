package com.zipcodewilmington.froilansfarm.Mammal;

//Horse can only eat Earcorn right now
// < Parameter type goes in here, "extends" - limits what the parameter type can be >

import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;

public class Horse extends Animal<EarCorn> implements Rideable <Farmer> {

    private Farmer rider;

    public Horse(String name) {
        super(name);
    }

    public Horse() {}

    @Override
    public String makeNoise(){
        return "Neigh";
    }

    @Override
    public void ride(Farmer rider) {
        this.rider = rider;
    }
}

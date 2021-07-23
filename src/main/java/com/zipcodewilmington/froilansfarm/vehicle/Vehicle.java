package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {
    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public void move() {

    }
}

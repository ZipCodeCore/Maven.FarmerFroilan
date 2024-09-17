package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {

    public boolean isBeingRidden = false;

    @Override
    public String makeNoise() {
        return "Honk!";
    }

    @Override
    public boolean getIsBeingRidden() {
        return isBeingRidden;
    }

    @Override
    public void setIsBeingRidden(boolean isBeingRidden) {
        this.isBeingRidden = isBeingRidden;
    }

}

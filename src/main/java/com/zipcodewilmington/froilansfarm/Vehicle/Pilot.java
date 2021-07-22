package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Animal.Person;

public class Pilot extends Person implements Aircraft{
    public Pilot() {
        super();
    }

    @Override
    public String noiseMaker() {
        return null;
    }

    @Override
    public boolean hasBeenRiden() {
        return false;
    }

    @Override
    public void fly(int distance) {

    }
}

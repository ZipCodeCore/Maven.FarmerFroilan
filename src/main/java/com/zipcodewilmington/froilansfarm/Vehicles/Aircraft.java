package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Rider;

public class Aircraft implements Vehicle{

    public void fly(){}

    public String makeNoise() {
        return "Bzzzzeewwwwwwwwwww Rat-tat-tat-tat-tat";
    }

    public String shoot(){
        return "BULLETS";
    }

    public void ride() {

    }

    @Override
    public void ride(Rider rider) {

    }
}

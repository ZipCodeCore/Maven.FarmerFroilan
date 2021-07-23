package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Rider;

public class Aircraft implements Vehicle{
    Rider rider;
    public void fly(){}

    public String makeNoise() {
        return "Bzzzzeewwwwwwwwwww Rat-tat-tat-tat-tat";
    }

    public String shoot(){
        return "BULLETS";
    }

    @Override
    public void ride(Rider rider) {
        rider = rider;
    }

    public Rider getRider() {
        return rider;
    }
}

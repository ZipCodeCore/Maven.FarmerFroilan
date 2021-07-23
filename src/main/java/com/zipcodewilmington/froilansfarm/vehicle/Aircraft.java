package com.zipcodewilmington.froilansfarm.vehicle;

public abstract class Aircraft implements FarmVehicle {


    public boolean fly(){
        return true;


    }


    @Override
    public boolean operate() {
        return false;
    }
}

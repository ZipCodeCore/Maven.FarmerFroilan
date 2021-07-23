package com.zipcodewilmington.froilansfarm.vehicle;

public abstract class Aircraft implements FarmVehicle {


    public boolean fly(){
        return true;


    }
    public void operate(Object vehicle) {

    }

    @Override
    public boolean operate() {
        return false;
    }
}

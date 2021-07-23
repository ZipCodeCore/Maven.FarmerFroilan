package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.CropRow;

public class CropDuster extends Vehicle implements FarmVehicle {



    public boolean fertilize(int row){
        return true;

    }

    public void operate(Object vehicle) {


    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public void move() {

    }
}

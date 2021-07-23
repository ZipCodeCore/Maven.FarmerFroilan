package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;

public class Tractor implements FarmVehicle<Vehicle>{



    private int crop;

    public Tractor(int crop) {
        this.crop = crop;
    }

    public int getCrop() {
        return crop;
    }

    public void setCrop(int crop) {
        crop = crop;
    }

    public boolean harvest(int crop){
        return true;

    }

    @Override


    public void operate(Object vehicle) {

    }


}

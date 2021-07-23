package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.FarmStorage;

public class Tractor extends Vehicle implements FarmVehicle<Vehicle>{



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

//    public void harvest(CropRow cropRow){
//        FarmStorage storage = FarmStorage.getInstance();
//        storage.add(cropRow.getCrop());
//    }



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

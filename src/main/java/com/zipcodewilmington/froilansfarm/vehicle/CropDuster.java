package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;

public class CropDuster extends Vehicle implements FarmVehicle {



    public void fertilize(CropRow row){



    }

    @Override
    public boolean operate() {
        return false;
    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public void move() {

    }
}

package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;

import java.util.List;

public class CropDuster extends Vehicle implements FarmVehicle {



    public void fertilize(CropRow row){
        List<Crop> crops = row.getCropsInRow();
        for (Crop crop : crops) {
            crop.setHasBeenFertilized(true);
        } row.getCropsInRow();



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

package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;

import java.util.List;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft {



    public <SomeCrop extends Crop> void fertilize(CropRow row){
        List<SomeCrop> crops = row.getCropsInRow();
        for (SomeCrop crop : crops) {
                crop.setHasBeenFertilized(true);
        }
    }

    @Override
    public String makeNoise() {
        return "Buzzzzz!";
    }


    @Override
    public boolean fly() {
        return false;
    }
}

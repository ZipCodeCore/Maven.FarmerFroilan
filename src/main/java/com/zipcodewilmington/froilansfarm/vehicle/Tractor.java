package com.zipcodewilmington.froilansfarm.vehicle;


import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.FarmStorage;

import java.util.ArrayList;
import java.util.List;

public class Tractor extends Vehicle implements FarmVehicle {



    private int crop;

     public Tractor(int crop) {

         this.crop = crop;
     }

    public <SomeCrop extends Crop> void harvest(CropRow cropRow){
        List<SomeCrop> list = cropRow.getCropsInRow();
        for (SomeCrop crop : list) {
            crop.setHasBeenHarvested(true);
        }

    }

    @Override
    public String makeNoise () {
         return null;
    }
}

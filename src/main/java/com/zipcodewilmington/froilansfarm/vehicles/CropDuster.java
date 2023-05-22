package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.plants.Crop;

public class CropDuster extends Aircraft {

    public void fertilize(CropRow cropRow) {
        for(Crop crop : cropRow.getCrops()) {
            crop.fertilize();
        }
    }

}

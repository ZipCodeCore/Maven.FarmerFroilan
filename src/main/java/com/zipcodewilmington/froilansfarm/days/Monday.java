package com.zipcodewilmington.froilansfarm.days;

import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Farmer;
import com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;

public class Monday {
    public static void monday(Farmer farmer, CropDuster cropDuster, Field field) {
        farmer.mount(cropDuster);
        cropDuster.fly();
        for(CropRow cropRow : field.getCropRows()) {
            cropDuster.fertilize(cropRow);
        }
    }
}

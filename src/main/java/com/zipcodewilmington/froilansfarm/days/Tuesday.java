package com.zipcodewilmington.froilansfarm.days;

import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Farmer;
import com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.plants.Crop;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

import java.util.ArrayList;
import java.util.List;

import static com.zipcodewilmington.froilansfarm.days.EveryMorning.everyMorning;

public class Tuesday {
    public static List<Edible> tuesday(Farmer farmer, Tractor tractor, Field field) {
        everyMorning();
        farmer.mount(tractor);
        List<Edible> yields = new ArrayList<>();
        for(CropRow cropRow : field.getCropRows()) {
            for(Crop crop : cropRow.getCrops()) {
                tractor.makeNoise();
                Edible yield = tractor.harvest(crop);
                if (yield != null) yields.add(yield);
            }
        }
        return yields;
    }
}

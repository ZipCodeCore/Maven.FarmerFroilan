package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.person.Person;
import com.zipcodewilmington.froilansfarm.animals.person.Pilot;
import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;

import java.util.ArrayList;
import java.util.List;

public class Froilanda extends Person implements Pilot {

    Farm farm = FroilansFarm.getInstance();

    public Farm getFarm() {
        return farm;
    }

    @Override
    public void fly(CropDuster cropDuster, Field field) {
        List<CropRow> list = field.getRowsInField();
        for (CropRow cropRow : list) {
            cropDuster.fertilize(cropRow);
        }
    }
}

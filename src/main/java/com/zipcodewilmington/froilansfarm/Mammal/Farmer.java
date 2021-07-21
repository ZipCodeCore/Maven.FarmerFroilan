package com.zipcodewilmington.froilansfarm.Mammal;

import com.zipcodewilmington.froilansfarm.Botanist;
import com.zipcodewilmington.froilansfarm.Food.Crop;
import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Food.Produce;

public class Farmer extends Person<Produce> implements Botanist {

    public Farmer(String name) {
        super(name);
    }

    @Override
    public void plant(Crop crop, CropRow cropRow) {

    }
}

package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.food.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class TomatoPlant extends Crop {

    @Override
    public Edible yield() {
        if(isFertilized() && !isHarvested()) {
            return new Tomato();
        }
        else {
            return null;
        }
    }

}

package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.food.Corn;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Cornstalk extends Crop {

    @Override
    public Edible yield() {
        if(isFertilized() && !isHarvested()) {
            return new Corn();
        }
        else {
            return null;
        }
    }

}

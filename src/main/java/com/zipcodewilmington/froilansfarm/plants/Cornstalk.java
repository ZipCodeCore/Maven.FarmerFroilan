package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.food.Corn;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Cornstalk extends Crop {

    @Override
    public Edible yield() {
        if(isFertilized() && !isHarvested()) {
            this.harvest();
            return new Corn();
        }
        else {
            this.harvest();
            return null;
        }
    }

}

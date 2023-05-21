package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.food.Corn;
import com.zipcodewilmington.froilansfarm.food.EdibleEgg;


public class Cornstalk extends Crop {

    @Override
    public EdibleEgg yield() {
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

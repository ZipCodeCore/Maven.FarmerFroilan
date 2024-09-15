package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.food.EdibleEgg;
import com.zipcodewilmington.froilansfarm.food.Tomato;

public class TomatoPlant extends Crop {

    @Override
    public EdibleEgg yield() {
        if(isFertilized() && !isHarvested()) {
            this.harvest();
            return new Tomato();
        }
        else {
            this.harvest();
            return null;
        }
    }

}

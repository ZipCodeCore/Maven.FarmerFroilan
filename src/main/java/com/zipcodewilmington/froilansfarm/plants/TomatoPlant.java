package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.food.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class TomatoPlant extends Crop {

    @Override
    public Edible yield() {
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

package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.Edible;

public class Produce implements Edible {
    private Boolean hasBeenFertilized;

    private Produce yield() {
        if(this.hasBeenFertilized){
            return this;
        } else {
            return null;
        }
    }
}

package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.Edible;

public class Egg implements Edible {

    private boolean isFertilized;

    public Egg() {
        isFertilized = false;
    }

    public boolean isItFertilized() {
        return isFertilized;
    }

    public void setIsFertilized(boolean fertilize) {
        this.isFertilized = fertilize;
    }
}

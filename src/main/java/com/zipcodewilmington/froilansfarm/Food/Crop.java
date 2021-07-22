package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.Edible;

public abstract class Crop implements Produce {
    private Boolean fertilized = false;
    private Boolean isHarvested = false;

    public void fertilize(){
        this.fertilized = true;
    }

    @Override
    public Edible yield() {
        return null;
    }

    public Boolean checkFertilized() {
        return fertilized;
    }

    public Boolean checkHarvested() {
        return isHarvested;
    }

    public void setHarvested(Boolean harvested) {
        isHarvested = harvested;
    }
}

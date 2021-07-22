package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.Edible;

public abstract class Crop implements Produce {
    private Boolean fertilized;
    private Boolean isHarvested;
    private Integer id;

    public Crop(Integer id) {
        this.fertilized = false;
        this.isHarvested = false;
        this.id = id;
    }

    public Crop() {
        this.fertilized = false;
        this.isHarvested = false;
        this.id = null;
    }


    public void fertilize(){
        this.fertilized = true;
    }

    @Override
    abstract public Edible yield();

    public Boolean checkFertilized() {
        return fertilized;
    }

    public Boolean checkHarvested() {
        return isHarvested;
    }

    public void setHarvested(Boolean harvested) {
        isHarvested = harvested;
    }

    public Integer getId() {
        return id;
    }
}

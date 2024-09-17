package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.farm.Produce;

public abstract class Crop <someType extends Edible> implements Produce <someType> {

    private boolean hasBeenHarvested;

    private boolean hasBeenFertilized;

    public Crop(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        this.hasBeenHarvested = hasBeenHarvested;
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean hasBeenFertilized() {

        return hasBeenFertilized;
    }

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public someType getEdible(someType crop) {
        return crop;
    }

    public someType yield(someType... crops) {
        for (someType crop : crops) {
            if (hasBeenFertilized() && hasBeenHarvested()) {
                return getEdible(crop);
            }
        }
        return null;
    }
}

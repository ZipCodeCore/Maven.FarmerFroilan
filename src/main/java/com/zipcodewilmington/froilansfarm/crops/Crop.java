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

   public someType getEdible() {
        return null;
    }

   public someType yield() {
       if(hasBeenFertilized() && hasBeenHarvested()) {
           return getEdible();
       }
       return null;
   }

}

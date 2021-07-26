package com.zipcodewilmington.froilansfarm.crops;

public class TomatoPlant extends Crop<Tomato>{

    public TomatoPlant(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        super(hasBeenHarvested, hasBeenFertilized);
    }

    @Override
    public Tomato getEdible(Tomato crop) {
        return super.getEdible(crop);
    }

}

package com.zipcodewilmington.froilansfarm.crops;

public class PotatoRoot extends Crop<Potato> {

    public PotatoRoot(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        super(hasBeenHarvested, hasBeenFertilized);
    }

    @Override
    public Potato getEdible(Potato crop) {
        return super.getEdible(crop);
    }
}

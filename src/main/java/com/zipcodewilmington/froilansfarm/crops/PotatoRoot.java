package com.zipcodewilmington.froilansfarm.crops;

public class PotatoRoot extends Crop<Potato> {

    public PotatoRoot(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        super(hasBeenHarvested, hasBeenFertilized);
    }

    protected Potato getEdible() {
        return new Potato();
    }
}

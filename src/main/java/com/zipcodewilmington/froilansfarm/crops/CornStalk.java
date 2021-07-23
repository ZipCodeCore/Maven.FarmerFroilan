package com.zipcodewilmington.froilansfarm.crops;

public class CornStalk extends Crop<EarCorn>{

    public CornStalk(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        super(hasBeenHarvested, hasBeenFertilized);
    }

    protected EarCorn getEdible() {
        return new EarCorn();
    }
}

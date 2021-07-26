package com.zipcodewilmington.froilansfarm.crops;

public class CornStalk extends Crop<EarCorn>{

    public CornStalk(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        super(hasBeenHarvested, hasBeenFertilized);
    }

    @Override
    public EarCorn getEdible(EarCorn crop) {
        return super.getEdible(crop);
    }
}

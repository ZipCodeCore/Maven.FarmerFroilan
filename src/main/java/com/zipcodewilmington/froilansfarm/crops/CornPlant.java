package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Produce;

public class CornPlant extends Crop{

    public CornPlant(Integer numOfEdiblesYielded, Integer numOfCropsHarvested, Integer numOfEdiblesEaten) {
        super(numOfEdiblesYielded, numOfCropsHarvested, numOfEdiblesEaten);
    }

    public CornPlant() {
        super();
    }

    @Override
    public void yield(Edible edible) {

    }

    @Override
    public boolean hasBeenFertilized() {
        return false;
    }

    @Override
    public boolean hasBeenHarvested() {
        return false;
    }
}

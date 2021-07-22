package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Produce;

public class TomatoPlant extends Crop{
    public TomatoPlant(Integer numOfEdiblesYielded, Integer numOfCropsHarvested, Integer numOfCropsFertilized) {
        super(numOfEdiblesYielded, numOfCropsHarvested, numOfCropsFertilized);
    }

    public TomatoPlant(Integer numberOfTomatoes) {
        super(numberOfTomatoes,0,0);
    }

    public TomatoPlant() {
        super();
    }

    public Edible getYield(){
        return new Tomato();
    }

    @Override
    public void yield(Edible edible) {
        if (hasBeenFertilized() == true) {
            numOfEdiblesYielded++;
            //}

        }
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

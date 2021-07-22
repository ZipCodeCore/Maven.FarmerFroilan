package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Produce;

public class TomatoPlant extends Crop{
    public TomatoPlant(Integer numOfEdiblesYielded, Integer numOfCropsHarvested, Integer numOfCropsFertilized, Integer numOfCropsAvailableToEat) {
        super(numOfEdiblesYielded, numOfCropsHarvested, numOfCropsFertilized, numOfCropsAvailableToEat);
    }

    public TomatoPlant(Integer numberOfCrops) {
        super(numberOfCrops,0,0,0);
    }

    public Edible getYield(){
        return new Tomato();
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

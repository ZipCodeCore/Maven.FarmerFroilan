package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Produce;

public abstract class Crop implements Produce {
    Integer numOfEdiblesYielded;    //once fertilized
    Integer numOfEdiblesHarvested; //once harvested
    Integer numOfEdiblesEaten; //decrement if eaten
    Boolean hasBeenFertilized;
    Boolean hasBeenHarvested;


    public Crop(Integer numOfYield, Integer numOfCropsHarvested, Integer numOfEdiblesLeft, Boolean hasBeenFertilized, Boolean hasBeenHarvested) {
        this.numOfEdiblesYielded = numOfYield;
        this.numOfEdiblesHarvested = numOfCropsHarvested;
        this.numOfEdiblesEaten = numOfEdiblesLeft;
        this.hasBeenFertilized = hasBeenFertilized;
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public Crop(Integer numOfYield, Integer numOfCropsHarvested, Integer numOfEdiblesLeft) {
        this(numOfYield, numOfCropsHarvested, numOfEdiblesLeft, false, false);
    }

    public Crop() {
        this(0, 0, 0);
    }

    public void fertilize() {
        this.hasBeenFertilized = true;
    }

    public void harvest() {
        this.hasBeenHarvested = true;
    }

    public Integer getNumOfEdiblesYielded() {
        return numOfEdiblesYielded;
    }


    public Integer getNumberofHarvest() {
        if (hasBeenHarvested) {
            return numOfEdiblesYielded;
        }
        return numOfEdiblesHarvested;
    }

    public void yield(Edible edible) {
        if (hasBeenFertilized) {
            numOfEdiblesYielded++;
        } else {
            throw new UnsupportedOperationException("Must be fertilized first!");
        }
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

    public Integer getFoodToEat() {
        return numOfEdiblesHarvested - numOfEdiblesEaten;
    }
}

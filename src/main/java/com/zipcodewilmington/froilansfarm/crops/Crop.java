package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Produce;

public abstract class Crop implements Produce {
    Integer numOfEdiblesYielded;
    Integer numOfCropsHarvested;
    Integer numOfCropsFertilized;
    Integer numOfCropsAvailableToEat;


    public Crop(Integer numOfCropsPlanted, Integer numOfCropsHarvested, Integer numOfCropsFertilized, Integer numOfCropsAvailableToEat) {
        this.numOfEdiblesYielded = numOfCropsPlanted;
        this.numOfCropsHarvested = numOfCropsHarvested;
        this.numOfCropsFertilized = numOfCropsFertilized;
        this.numOfCropsAvailableToEat = numOfCropsAvailableToEat;
    }


    public Integer getNumOfCropsPlanted() {
        return numOfEdiblesYielded;
    }

    public void setNumOfCropsPlanted(Integer numOfCropsPlanted) {
        this.numOfEdiblesYielded = numOfCropsPlanted;
    }

    public Integer getNumOfCropsHarvested() {
        return numOfCropsHarvested;
    }

    public void setNumOfCropsHarvested(Integer numOfCropsHarvested) {
        this.numOfCropsHarvested = numOfCropsHarvested;
    }

    public Integer getNumOfCropsFertilized() {
        return numOfCropsFertilized;
    }

    public void setNumOfCropsFertilized(Integer numOfCropsFertilized) {
        this.numOfCropsFertilized = numOfCropsFertilized;
    }

    public Integer getNumOfCropsAvailableToEat() {
        return numOfCropsAvailableToEat;
    }

    public void setNumOfCropsAvailableToEat(Integer numOfCropsAvailableToEat) {
        this.numOfCropsAvailableToEat = numOfCropsAvailableToEat;
    }
}

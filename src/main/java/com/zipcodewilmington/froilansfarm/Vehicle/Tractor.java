package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.CropRow;

public class Tractor extends FarmVehicle {
    boolean toBeHarvested;
    int numOfFertCrop;
    int numOfHarvCrop;

    public Tractor(boolean toBeHarvested, int numOfFertCrop, int numOfHarvCrop) {
        super();
        this.toBeHarvested = toBeHarvested;
        this.numOfFertCrop = numOfFertCrop;
        this.numOfHarvCrop = numOfHarvCrop;
    }

    public boolean isToBeHarvested() {
        return toBeHarvested;
    }

    public void setToBeHarvested(boolean toBeHarvested) {
        this.toBeHarvested = toBeHarvested;
    }

    public void setNumOfFertCrop(int numOfFertCrop) {
        this.numOfFertCrop = numOfFertCrop;
    }

    public void setNumOfHarvCrop(int numOfHarvCrop) {
        this.numOfHarvCrop = numOfHarvCrop;
    }

    public int getNumOfHarvCrop() {
        return this.numOfHarvCrop;
    }

    public int getNumOfFertCrop() {
        return this.numOfFertCrop;
    }

    public boolean needsToBeHarvested(CropRow cropRow) {
        for (Crop crop : cropRow.getCropRow()) {
            if (crop.hasBeenHarvested() == false) {
                return true;
            }
        }
        return false;
    }
}


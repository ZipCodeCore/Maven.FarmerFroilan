package com.zipcodewilmington.froilansfarm.Vehicle;

public class Tractor extends FarmVehicle {
    boolean toBeHarvested;
    int numOfFertCrop;
    int numOfHarvCrop;

    public Tractor(boolean toBeHarvested, int numOfFertCrop, int numOfHarvCrop) {
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

    public boolean needsToBeHarvested(int numOfFertCrop, int numOfHarvCrop) {
        Tractor crop=new Tractor(false, numOfFertCrop, numOfHarvCrop);
        int numNonHarvCrops= numOfFertCrop-numOfHarvCrop;
        int cropWork = numOfFertCrop/3;
        if(numNonHarvCrops>cropWork){
            return toBeHarvested=true;
        }
        return toBeHarvested=false;}
}


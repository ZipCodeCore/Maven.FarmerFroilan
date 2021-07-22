package com.zipcodewilmington.froilansfarm.Vehicle;

public class CropDuster extends FarmVehicle implements Aircraft {

    public boolean toBeFertilized;
    public int numOfCropRows;
    public int numOfCropFert;

    public CropDuster(boolean toBeFertilized, int numOfCropRows, int numOfCropFert) {
        this.toBeFertilized = toBeFertilized;
        this.numOfCropRows = numOfCropRows;
        this.numOfCropFert = numOfCropFert;
    }

    public boolean isToBeFertilized() {
        return toBeFertilized;
    }

    public void setToBeFertilized(boolean toBeFertilized) {
        this.toBeFertilized = toBeFertilized;
    }

    public int getNumOfCropFert() {
        return numOfCropFert;
    }

    public void setNumOfCropFert(int numOfCropFert) {
        this.numOfCropFert = numOfCropFert;
    }


    public void setNumOfCropRows(int numOfCropRows){this.numOfCropRows=numOfCropRows;

    }
    public int getNumOfCropRows(){ return this.numOfCropRows;
    }

    public void setNumOfFertCrop(int numOfCropFert){this.numOfCropFert=numOfCropFert;}

    public int getNumOfFertCrop() { return this.numOfCropFert; }

    public boolean needsToBeFertilized(int numOfCropRows, int numOfCropFert) {
        int numNonFertCrops= numOfCropRows-numOfCropFert;
        int cropWork = numOfCropRows/3;
        if(numNonFertCrops>cropWork){
            return toBeFertilized=true;
        }
        return toBeFertilized=false;}

    @Override
    public void fly(int distance) {

    }

    @Override
    public String noiseMaker() {
        return "Ppbd Ppbd";
    }

    @Override
    public boolean hasBeenRiden() {
        return false;
    }



}

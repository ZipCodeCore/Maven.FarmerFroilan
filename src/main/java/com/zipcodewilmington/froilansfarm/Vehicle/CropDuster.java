package com.zipcodewilmington.froilansfarm.Vehicle;

public class CropDuster extends FarmVehicle implements Aircraft {

    public boolean fertilizer;
    public int numOfCropRows;
    public int numOfCropFert;

    @Override
    public void fly(int distance) {

    }

    @Override
    public String noiseMaker() {
        return null;
    }

    @Override
    public boolean hasBeenRiden() {
        return false;
    }
    public void setNumOfCropRows(){

    }
    public int getNumOfCropRows(){ return 0;
    }

    public boolean hasFertilizer() {
    }

    public void setNumOfFertCrop(){}

    public int getNumOfFertCrop() { return 0;
    }

}

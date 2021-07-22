package com.zipcodewilmington.froilansfarm.Vehicle;

public class CropDuster extends FarmVehicle implements Aircraft {

    public boolean toBeFertilized;
    public int numOfCropRows;
    public int numOfCropFert;

    public CropDuster (){
        toBeFertilized=false;
        numOfCropFert=0;
        numOfCropRows=0;
    }
    public CropDuster(int numOfCropRows, int numOfCropFert){
    }
    public void setNumOfCropRows(){this.numOfCropRows=numOfCropRows;

    }
    public int getNumOfCropRows(){ return this.numOfCropRows;
    }

    public boolean needsToBeFertilized(int numOfCropRows, int numOfCropFert) {
        int numNonFertCrops= numOfCropRows-numOfCropFert;
        int cropWork = numOfCropRows/3;
        if(numNonFertCrops>cropWork){
            return toBeFertilized=true;
        }
        return toBeFertilized=false;}

    public void setNumOfFertCrop(){this.numOfCropFert=numOfCropFert;}

    public int getNumOfFertCrop() { return this.numOfCropFert;
    }
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

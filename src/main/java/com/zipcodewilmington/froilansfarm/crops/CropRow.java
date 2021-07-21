package com.zipcodewilmington.froilansfarm.crops;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    List<Crop> cropRow;
    Integer numOfCropsPlanted;
    Integer numOfCropsHarvested;
    Integer numOfCropsFertilized;
    Integer numOfCropsAvailableToEat;

    public CropRow(List<Crop> cropRow, Integer numOfCropsPlanted, Integer numOfCropsHarvested, Integer numOfCropsFertilized, Integer numOfCropsAvailableToEat) {
        this.cropRow = cropRow;
        this.numOfCropsPlanted = numOfCropsPlanted;
        this.numOfCropsHarvested = numOfCropsHarvested;
        this.numOfCropsFertilized = numOfCropsFertilized;
        this.numOfCropsAvailableToEat = numOfCropsAvailableToEat;
    }

    public CropRow() {
        this.cropRow = new ArrayList<>();
        this.numOfCropsPlanted = 0;
        this.numOfCropsHarvested = 0;
        this.numOfCropsFertilized = 0;
        this.numOfCropsAvailableToEat = 0;
    }

    public int getNumberofCropsPlanted() {return numOfCropsPlanted;}

    public int getCropRowSize() {
        return cropRow.size();
    }
}

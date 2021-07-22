package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Edible;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    List<Crop> cropRow;


    public CropRow(List<Crop> cropRow) {
        this.cropRow = cropRow;

    }

    public CropRow() {
        this.cropRow = new ArrayList<>();
    }

    public int getNumberofCropsPlanted() {return cropRow.size();}

    public List<Crop> getCropRow() {
        return cropRow;
    }

    public void addCrop(Crop crop, Integer numberOfCrops){
        for (int i = 0; i < numberOfCrops; i++) {
            cropRow.add(crop);
        }
    }
     public void addCrop(Crop crop){
        cropRow.add(crop);
     }

    public void removeCrop(Crop crop) {
        cropRow.remove(crop);
    }

    public int getNumberOfEdibles() {
        int sum = 0;
        for (Crop crop : cropRow) {
            sum += crop.getNumOfEdiblesYielded();
        }
        return sum;
    }

}

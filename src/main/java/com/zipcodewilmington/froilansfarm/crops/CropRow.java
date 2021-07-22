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


    public void addCrop(Crop crop,Integer numberOfCrops){
        for (int i = 0; i < numberOfCrops; i++) {
            cropRow.add(crop);
        }
    }
}

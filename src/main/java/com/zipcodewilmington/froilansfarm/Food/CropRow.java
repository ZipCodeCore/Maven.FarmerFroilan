package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.Edible;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    private List<Crop> cropList;

    public CropRow() {
        cropList = new ArrayList<>();
    }

    public void plantCrop(Crop crop) {
        this.cropList.add(crop);
    }

    public Integer getNumberOfCrops() {
        return cropList.size();
    }

    public Crop getCropById(Integer id) {
        Crop result = null;
        for (Crop crop : cropList) {
            result = id == crop.getId() ? crop : null;
        }
        return result;
    }


    public void fertilizeRow() {
        cropList.forEach(Crop::fertilize);
    }

    public ArrayList<Edible> harvestRow() {
        ArrayList<Edible> harvest = new ArrayList<>();
        cropList.forEach(crop -> {
            harvest.add(crop.yield());
            crop.setHarvested(true);
        });
        return harvest;
    }

    public List<Crop> getCropList() {
        return cropList;
    }
}

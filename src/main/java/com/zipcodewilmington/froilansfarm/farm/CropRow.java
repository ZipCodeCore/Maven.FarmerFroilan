package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.Edible;

import java.util.ArrayList;
import java.util.List;

public class CropRow <SomeCrop extends Crop> {

    private List<SomeCrop> cropsInRow = new ArrayList<>();

    public CropRow(SomeCrop someCrop) {
        for (int i = 0; i < 15; i++) {
            cropsInRow.add(someCrop);
        }
    }

    public List<SomeCrop> getCropsInRow() {
        return cropsInRow;
    }

    public Integer getNumberOfCropsInRow() {
        return cropsInRow.size();
    }
}

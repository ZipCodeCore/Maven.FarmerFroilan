package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.crops.CropRow;

import java.util.ArrayList;
import java.util.List;

public class Field implements StorageInterface {

    List<CropRow> listOfCropRow;

    public Field () {
        this.listOfCropRow = new ArrayList<>();
    }

    @Override
    public void add(Object thingYouAreStoring) {
        CropRow cropRow = new CropRow();
        listOfCropRow.add(cropRow);
    }

    @Override
    public void remove(Object thingYouAreStoring) {
        CropRow cropRow = new CropRow();
        listOfCropRow.remove(cropRow);
    }

    @Override
    public int amount(Object thingYouAreStoring) {
        return listOfCropRow.size();
    }
}

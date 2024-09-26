package com.zipcodewilmington.froilansfarm.storage;

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
        listOfCropRow.add((CropRow) thingYouAreStoring);
    }

    @Override
    public void remove(Object thingYouAreStoring) {
        listOfCropRow.remove(thingYouAreStoring);
    }

    @Override
    public int amount(Object thingYouAreStoring) {
        return listOfCropRow.size();
    }

    public Integer getListOfCropRow() {
        return listOfCropRow.size();
    }
}

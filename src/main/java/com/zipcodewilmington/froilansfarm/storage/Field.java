package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.crops.CropRow;

import java.util.ArrayList;
import java.util.List;

public class Field implements StorageInterface <CropRow> {
    private List<CropRow> list = new ArrayList<>();

    @Override
    public List<CropRow> getList() {
        return list;
    }
}

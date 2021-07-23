package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Food.CropRow;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private List<CropRow> myField = new ArrayList<>();


    public void add(CropRow row){
        myField.add(row);
    }

    public List<CropRow> getMyField() {
        return myField;
    }
}

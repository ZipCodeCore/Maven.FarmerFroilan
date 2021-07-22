package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Food.CropRow;

import java.util.List;

public class Field {
    private List<CropRow> myField;

    public void add(CropRow row){
        myField.add(row);
    }

    public List<CropRow> getMyField() {
        return myField;
    }
}

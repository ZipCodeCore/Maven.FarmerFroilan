package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Field {

    private List<CropRow> rowsInField;

    public Field(CropRow... cropRows) { // 5,
        rowsInField = new ArrayList<>(Arrays.asList(cropRows));
    }

    public List<CropRow> getRowsInField() {
        return rowsInField;
    }
}

package com.zipcodewilmington.froilansfarm;

import java.util.Arrays;

public class CropRow extends Crop{
    private Integer amount;
    private Crop crop;

    public CropRow(Crop crop, Integer amount){
        this.crop = crop;
        this.amount = amount;
    }

    public void fertilize(){
        super.fertilize();
    }
}

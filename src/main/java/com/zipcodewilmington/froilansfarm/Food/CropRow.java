package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.Food.Crop;

public class CropRow extends Crop {
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

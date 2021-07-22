package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.Food.Crop;

public class CropRow extends Crop {
    private Integer amount;
    private Crop crop;

    public CropRow(){
        this.amount = 0;
        this.crop = null;
    }

    public void fertilize(){
        super.fertilize();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }
}

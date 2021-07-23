package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.farm.Produce;

public abstract class Crop <cropType extends Edible> implements Produce {

    public boolean hasBeenFertilized() {
        return false;
    }

    public void addCrop() {
        // crop.add();
    }

    public void removeCrop() {
        // crop.remove();
    }
}

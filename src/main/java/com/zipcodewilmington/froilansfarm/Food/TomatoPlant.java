package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.Food.Crop;
import com.zipcodewilmington.froilansfarm.Food.Tomato;

public class TomatoPlant extends Crop {

    @Override
    public Tomato yield() {
        if(this.checkFertilized() && !this.checkHarvested()){
            this.setHarvested(true);
            return new Tomato();
        }
        return null;
    }
}

package com.zipcodewilmington.froilansfarm.animals.person;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;

public class Farmer extends Person implements Rider, Botanist {

   public Farmer(){

   }

    public Farmer(String name) {
        super(name);
    }

    public void mount(Rideable rideable) {

    }

    public void dismount() {

    }

    public void plant(Crop crop, CropRow row) {

    }

    public String makeNoise(){
        return "YeeHaw!";
    }
}

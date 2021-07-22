package com.zipcodewilmington.froilansfarm.Mammal;

import com.zipcodewilmington.froilansfarm.Botanist;
import com.zipcodewilmington.froilansfarm.Food.Crop;
import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Food.Produce;
import com.zipcodewilmington.froilansfarm.Ridable;
import com.zipcodewilmington.froilansfarm.Rider;

public class Farmer extends Person<Produce> implements Botanist, Rider {

    private Ridable isRiding = null;

    public Farmer(String name) {
        super(name);
    }

    public Farmer() {
        super("Froilan");
    }

    @Override
    public void plant(Crop crop, CropRow cropRow) {

    }

    @Override
    public String makeNoise(){
        return "Howdy";
    }

    @Override
    public void mount(Ridable rideable) {
        this.isRiding = rideable;
    }

    @Override
    public void dismount(Ridable rideable) {
        this.isRiding = null;
    }
}

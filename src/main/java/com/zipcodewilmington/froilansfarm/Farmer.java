package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person<Produce> implements Botanist{

    public Farmer(String name) {
        super(name);
    }

    @Override
    public void plant(Crop crop, CropRow cropRow) {

    }
}

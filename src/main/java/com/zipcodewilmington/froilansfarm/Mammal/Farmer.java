package com.zipcodewilmington.froilansfarm.Mammal;

import com.zipcodewilmington.froilansfarm.Botanist;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Food.Crop;
import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Food.Produce;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends Person<Edible> implements Botanist, Rider {

    private Rideable isRiding = null;
    public List<Edible> meals = new ArrayList<>();

    public Farmer(String name) {
        super(name);
    }

    public Farmer() {
        super("Froilan");
    }

    @Override
    public void plant(Crop crop, CropRow cropRow) {
        cropRow.plantCrop(crop);
    }

    @Override
    public String makeNoise(){
        return "Howdy";
    }

    @Override
    public void mount(Rideable rideable) {
        this.isRiding = rideable;
    }

    @Override
    public void dismount(Rideable rideable) {
        this.isRiding = null;
    }

    @Override
    public void eat(Edible edible) { meals.add(edible); }

    public List<Edible> getMealList() { return meals; }
}

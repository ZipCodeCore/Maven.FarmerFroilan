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

public class Farmer extends Person<Edible> implements Rider {

    private Rideable isRiding = null;


    public Farmer(String name) {
        super(name);
    }

    public Farmer() {
        super("Froilan");
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

    public Rideable getIsRiding() { return isRiding; }

}

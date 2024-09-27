package com.zipcodewilmington.froilansfarm.Mammal;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Pilot;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Vehicle;

public class Froilanda extends Farmer implements Pilot {
    private static final Froilanda froilanda = new Froilanda();

    public static Froilanda getInstance(){
        return froilanda;
    }

    private Froilanda() {
        super("Froilanda");
    }
//this is a singleton

    public void eatBreakfast(EarCorn earCorn, Tomato tomato, Egg egg){
    }


    @Override
    public void fly(Farm farm) {
        if(getIsRiding() instanceof CropDuster){
            ((CropDuster<?>) getIsRiding()).operate(farm);
        }
    }
}

package com.zipcodewilmington.froilansfarm.Mammal;

import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Pilot;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;

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
    public void mount(Rideable rideable) {
    }

    @Override
    public void dismount(Rideable rideable) {
    }

    @Override
    public void fly() {
    }
}

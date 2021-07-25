package com.zipcodewilmington.froilansfarm.Mammal;

import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Food.Produce;


public class Chicken extends Animal<EarCorn> implements Edible, Produce {
    private Boolean isFertilized;

    public Chicken(String name) {
        super(name);
        this.meals = meals;
    }

    public Chicken() { }

    @Override
    public String makeNoise() {
        return "Cluck Cluck";
    }

    public void fertilize(){
        this.isFertilized = true;
    }

    @Override
    public Egg yield() {
        if (isFertilized){
            return new Egg();
        }
        return null;
    }

}

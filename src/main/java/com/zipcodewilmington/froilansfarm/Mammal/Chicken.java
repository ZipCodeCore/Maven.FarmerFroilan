package com.zipcodewilmington.froilansfarm.Mammal;

import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Food.Egg;

public class Chicken extends Animal<EarCorn> implements Edible {

    public Chicken(String name) {
        super(name);
    }

    public Chicken() { }

    boolean isFertlized = false;

    public Egg yield() {
        if (isFertlized){
            return new Egg();
        }
        return null;
    }

}

package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal <EarCorn> implements Edible {

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

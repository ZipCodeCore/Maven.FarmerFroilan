package com.zipcodewilmington.froilansfarm.Mammal;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.NoiseMaker;

public abstract class Animal <T extends Edible> implements Eater<T>, NoiseMaker {
    private String name;

    public Animal() {
        name = "";
    }

    public void eat(T edible) {

    }

    public String makeNoise() {
        return null;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

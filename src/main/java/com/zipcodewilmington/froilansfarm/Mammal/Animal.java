package com.zipcodewilmington.froilansfarm.Mammal;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.NoiseMaker;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal <T extends Edible> implements Eater<T>, NoiseMaker {
    private String name;
    public List<T> meals = new ArrayList<>();

    public Animal() {
        name = "";
    }

    public void eat(T ... edibles) {
        for (int i = 0; i < edibles.length; i++) {
            T edible = edibles[i];
            eat(edible);
        }
    }

    public void eat(T edible) { meals.add(edible); }

    public List<T> getMealList() { return meals; }

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

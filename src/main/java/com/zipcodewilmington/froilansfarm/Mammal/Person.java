package com.zipcodewilmington.froilansfarm.Mammal;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.NoiseMaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person<T extends Edible> implements Eater<T>, NoiseMaker {

    private String name;
    public List<Edible> meals = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(T ... edibles) {
        for (int i = 0; i < edibles.length; i++) {
            T edible = edibles[i];
            eat(edible);
        }
    }

    @Override
    public void eat(T edible) { meals.add(edible); }

    public List<Edible> getMealList() { return meals; }

    @Override
    public String makeNoise(){
        return "Hello";
    }


}

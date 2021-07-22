package com.zipcodewilmington.froilansfarm.Mammal;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.NoiseMaker;

public class Person<T extends Edible> implements Eater<T>, NoiseMaker {

    private String name;

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

    @Override
    public void eat(T edible) {
    }

    @Override
    public String makeNoise(){
        return "Hello, im suffering";
    }

}

package com.zipcodewilmington.froilansfarm;

public class Animal implements Eater, NoiseMaker {
    private String name;

    public void eat(Object o) {

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

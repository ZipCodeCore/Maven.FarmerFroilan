package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Rideable;

public class Horse extends Animal implements Rideable {

    String name;
    Integer age;
    Integer amountOfFoodEaten;

    public Horse(String name, Integer age, Integer amountOfFoodEaten) {
        super(name, age, amountOfFoodEaten);
    }


    public Horse() {
        this.name = "";
        this.age = 0;
        this.amountOfFoodEaten = 0;
    }


    public boolean hasBeenRiden() {
        return false;
    }

    public String makeNoise() {
        return "Neigh!";
    }
}

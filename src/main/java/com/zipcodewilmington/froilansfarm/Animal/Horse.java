package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Rideable;

public class Horse extends Animal implements Rideable {


    public Horse(String name,Integer age,Integer amountOfFoodEaten){
        super(name,age,amountOfFoodEaten);
    }

    public Horse(){}

    public boolean hasBeenRiden() {
        return false;
    }

    public String makeNoise() {
        return "Neigh!";
    }
}

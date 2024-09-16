package com.zipcodewilmington.froilansfarm.Animal;

public class Person {
    String name;
    int amountOfFoodEaten;

    public Person(String name, int amountOfFoodEaten) {
        this.name = name;
        this.amountOfFoodEaten = amountOfFoodEaten;
    }

    public Person() {
        this.name = "";
        this.amountOfFoodEaten = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfFoodEaten() {
        return amountOfFoodEaten;
    }

    public void setAmountOfFoodEaten(int amountOfFoodEaten) {
        this.amountOfFoodEaten = amountOfFoodEaten;
    }
}

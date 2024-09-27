package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animals.Animal;

import java.util.*;

public abstract class Shelter <SomeType extends Animal> {

    private List<SomeType> animals = new ArrayList<SomeType>();

    public void add(SomeType animal) {
        animals.add(animal);
    }

    public void remove(SomeType animal) {
        animals.remove(animal);
    }

    public Integer getNumberOfAnimals() {
        return animals.size();
    }

    public List<SomeType> getAnimals() {
        return animals;
    }

    public void setAnimals(List<SomeType> animals) {
        this.animals = animals;
    }
}

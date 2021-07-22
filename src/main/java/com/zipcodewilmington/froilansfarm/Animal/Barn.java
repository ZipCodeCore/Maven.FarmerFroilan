package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.storage.StorageInterface;

import java.util.ArrayList;
import java.util.List;

public abstract class Barn<T> implements StorageInterface {
    List<T> animals;

    public Barn() {
        animals = new ArrayList<T>();
    }

    public Integer numberOfAnimals(T animal){
    return animals.size();
    }


//    public void add(T animal) {
//        animals.add(animal);
//    }
//
//    public void remove(T animal) {
//        animals.remove(animal);
//    }

    public List<T> getAnimals() {
        return animals;
    }

    public void setAnimals(List<T> animals) {
        this.animals = new ArrayList<>(animals);
    }
}
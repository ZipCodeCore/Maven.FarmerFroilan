package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.storage.StorageInterface;

import java.util.ArrayList;
import java.util.List;

public abstract class Barn<T extends Animal> implements StorageInterface <T> {
    List<T> animals;

    public Barn() {
        animals = new ArrayList<>();
    }
//
//    public Integer numberOfAnimals(){
//    return animals.size();
//    }
//
//
//    public void add(T animal) {
//        animals.add(animal);
//    }
//
//    public void remove(T animal) {
//        animals.remove(animal);
//    }

    public List<T> getList() {
        return animals;
    }

    public void setAnimals(List<T> animals) {
        this.animals = new ArrayList<>(animals);
    }


}
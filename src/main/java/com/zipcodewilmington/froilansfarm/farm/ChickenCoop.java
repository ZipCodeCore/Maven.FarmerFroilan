package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;

import java.util.List;

public class ChickenCoop extends Shelter<Chicken> {

    public ChickenCoop() {
    }

    public ChickenCoop(List<Chicken> chickens) {
        super.setAnimals(chickens);
    }
}

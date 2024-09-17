package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;

import java.util.*;

public class ChickenCoop extends Shelter<Chicken> {

    public ChickenCoop() {
    }

    public ChickenCoop(Chicken... chickens) {
        super.setAnimals(new ArrayList<>(Arrays.asList(chickens)));
    }
}

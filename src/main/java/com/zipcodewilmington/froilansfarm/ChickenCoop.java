package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop implements StorageInterface {

    List<Chicken> listOfChicken;

    public ChickenCoop () {
        listOfChicken = new ArrayList<>();
    }

    @Override
    public void add(Object thingYouAreStoring) {
        Chicken chicken = new Chicken();
        listOfChicken.add(chicken);
    }

    @Override
    public void remove(Object thingYouAreStoring) {
        Chicken chicken = new Chicken();
        listOfChicken.remove(chicken);
    }

    @Override
    public int amount(Object thingYouAreStoring) {
        return listOfChicken.size();
    }
}

package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.Animal.Barn;
import com.zipcodewilmington.froilansfarm.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop extends Barn {

    List<Chicken> listOfChicken;

    public ChickenCoop () {
        listOfChicken = new ArrayList<>();
    }

    @Override
    public void add(Object thingYouAreStoring) {
        listOfChicken.add((Chicken) thingYouAreStoring);
    }

    @Override
    public void remove(Object thingYouAreStoring) {
        listOfChicken.remove(thingYouAreStoring);
    }

    @Override
    public int amount(Object thingYouAreStoring) {
        return listOfChicken.size();
    }

    public Integer getListOfChicken() {
        return listOfChicken.size();
    }
}

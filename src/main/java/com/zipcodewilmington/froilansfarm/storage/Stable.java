package com.zipcodewilmington.froilansfarm.storage;

import Animal.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable implements StorageInterface {

    List<Horse> listOfHorses;

    public Stable () {
        listOfHorses = new ArrayList<>();
    }

    @Override
    public void add(Object thingYouAreStoring) {
        listOfHorses.add((Horse) thingYouAreStoring);
    }

    @Override
    public void remove(Object thingYouAreStoring) {
        listOfHorses.remove(thingYouAreStoring);
    }

    @Override
    public int amount(Object thingYouAreStoring) {
        return listOfHorses.size();
    }

    public Integer getListOfHorses () {
        return listOfHorses.size();
    }
}

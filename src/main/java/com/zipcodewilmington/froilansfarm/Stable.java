package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Stable implements StorageInterface {

    List<Horse> listOfHorses;

    public Stable () {
        listOfHorses = new ArrayList<>();
    }

    @Override
    public void add(Object thingYouAreStoring) {
        Horse horse = new Horse();
        listOfHorses.add(horse);
    }

    @Override
    public void remove(Object thingYouAreStoring) {
        Horse horse = new Horse();
        listOfHorses.remove(horse);
    }

    @Override
    public int amount(Object thingYouAreStoring) {
        return listOfHorses.size();
    }
}

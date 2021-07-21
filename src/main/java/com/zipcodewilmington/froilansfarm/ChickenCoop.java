package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop implements Shelter<Chicken> {

    List<Chicken> chickenList = new ArrayList<Chicken>();
    Chicken chicken;

    public void add(Chicken thingToBeStored) {
        chickenList.add(thingToBeStored);
    }

    public Chicken getTypeByName(String name) {
        return chicken.getName();
    }

    public void remove(Chicken thingToBeStored) {
        chickenList.remove(thingToBeStored);
    }
}

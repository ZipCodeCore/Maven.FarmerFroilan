package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop implements Shelter<Chicken> {

    List<Chicken> chickenList = new ArrayList<Chicken>();
    Chicken chicken;

    public ChickenCoop(Chicken chicken) {
        this.chicken = chicken;
        this.chickenList = chickenList;
    }
    public void add(Chicken chicken) {
        chickenList.add(chicken);
    }

    public Chicken getTypeByName(String name) {
        return chicken.getName();
    }

    public void remove(Chicken chicken) {
        chickenList.remove(chicken);
    }
}

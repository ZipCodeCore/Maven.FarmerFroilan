package com.zipcodewilmington.froilansfarm.Structure;

import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import com.zipcodewilmington.froilansfarm.Shelter;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop implements Shelter<Chicken> {

    List<Chicken> chickenList = new ArrayList<Chicken>();
    Chicken chicken;

    public ChickenCoop(Chicken chicken) {
        this.chicken = chicken;
        this.chickenList = chickenList;
    }

    public ChickenCoop() {
    }

    public void add(Chicken chicken) {
        chickenList.add(chicken);
    }

    public Chicken getObjectByName(String name) {
        for(Chicken element : chickenList) {
            if(element.equals(name)) {
                chicken = element;
            }
        }
        return chicken;
    }

    public void remove(Chicken chicken) {
        chickenList.remove(chicken);
    }

    public List<Chicken> getChickenList() {
        return chickenList;
    }
}

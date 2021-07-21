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
        Chicken thisChicken = new Chicken();
        for(Chicken chicken : chickenList) {
            if(chicken.equals(name)) {
                thisChicken = chicken;
            }
        }
        return thisChicken;
    }

    public void remove(Chicken chicken) {
        chickenList.remove(chicken);
    }

    public List<Chicken> getChickenList() {
        return chickenList;
    }
}

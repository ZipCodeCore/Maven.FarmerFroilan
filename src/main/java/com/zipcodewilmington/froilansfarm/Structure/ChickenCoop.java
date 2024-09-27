package com.zipcodewilmington.froilansfarm.Structure;

import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import com.zipcodewilmington.froilansfarm.Shelter;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop implements Shelter<Chicken> {

    List<Chicken> chickenList = new ArrayList<Chicken>();



    public ChickenCoop() {
    }

    public void add(Chicken chicken) {
        chickenList.add(chicken);
    }

    public Chicken getObjectByName(String name) {
        for(Chicken chicken : chickenList) {
            if(chicken.getName().equals(name)) {
                return chicken;
            }
        }
        return null;
    }

    public void remove(Chicken chicken) {
        chickenList.remove(chicken);
    }

    public List<Chicken> getChickenList() {
        return chickenList;
    }
}

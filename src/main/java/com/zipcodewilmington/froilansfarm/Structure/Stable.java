package com.zipcodewilmington.froilansfarm.Structure;

import com.zipcodewilmington.froilansfarm.Mammal.Horse;
import com.zipcodewilmington.froilansfarm.Shelter;

import java.util.ArrayList;
import java.util.List;

public class Stable implements Shelter<Horse> {

    List<Horse> horseList = new ArrayList<Horse>();

    public Stable() {}

    public void add(Horse horse) {
        horseList.add(horse);
    }

    public Horse getObjectByName(String name) {
        for(Horse horse : horseList) {
            if(horse.getName().equals(name)) {
                return horse;
            }
        }
        return null;
    }

    public void remove(Horse horse) {
        horseList.remove(horse);
    }

    public List<Horse> getHorseList() {
        return horseList;
    }
}

package com.zipcodewilmington.froilansfarm.Structure;

import com.zipcodewilmington.froilansfarm.Mammal.Horse;
import com.zipcodewilmington.froilansfarm.Shelter;

import java.util.ArrayList;
import java.util.List;

public class Stable implements Shelter<Horse> {

    List<Horse> horseList = new ArrayList<Horse>();
    Horse horse;

    public Stable(Horse horse) {
        this.horse = horse;
        this.horseList = horseList;
    }

    public Stable() {}

    public void add(Horse horse) {
        horseList.add(horse);
    }

    public Horse getObjectByName(String name) {
        for(Horse element : horseList) {
            if(element.equals(name)) {
                horse = element;
            }
        }
        return horse;
    }

    public void remove(Horse horse) {
        horseList.remove(horse);
    }

    public List<Horse> getHorseList() {
        return horseList;
    }
}

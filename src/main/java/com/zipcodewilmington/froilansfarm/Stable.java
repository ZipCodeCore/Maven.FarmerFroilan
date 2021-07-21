package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Stable implements Shelter<Horse> {

    List<Horse> horseList = new ArrayList<Horse>();
    Horse horse;

    public void add(Horse thingToBeStored) {
        horseList.add(thingToBeStored);
    }

    public Horse getTypeByName(String name) {
        return horse.getName();
    }

    public void remove(Horse thingToBeStored) {
        horseList.remove(thingToBeStored);
    }
}

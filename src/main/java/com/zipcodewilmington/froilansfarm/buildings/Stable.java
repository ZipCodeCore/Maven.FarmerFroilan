package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable {

    private List<Horse> horses = new ArrayList<>();

    //additional add horse method
    public void addHorse(Horse horse) {
        horses.add(horse);
    }

}

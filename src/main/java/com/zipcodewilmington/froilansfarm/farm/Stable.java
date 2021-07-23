package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animals.Horse;

import java.util.*;

public class Stable extends Shelter<Horse> {

    public Stable() {
    }

    public Stable(Horse... horses) {
        super.setAnimals(new ArrayList<>(Arrays.asList(horses)));
    }
}

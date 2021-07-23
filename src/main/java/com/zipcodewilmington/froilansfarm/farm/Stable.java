package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animals.Horse;

import java.util.List;

public class Stable extends Shelter<Horse> {

    public Stable() {
    }

    public Stable(List<Horse> horses) {
        super.setAnimals(horses);
    }
}

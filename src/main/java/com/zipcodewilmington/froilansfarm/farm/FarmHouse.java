package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animals.person.Person;

import java.util.*;

public class FarmHouse extends Shelter<Person> {

    public FarmHouse() {
    }

    public FarmHouse(Person... people) {
        super.setAnimals(new ArrayList<>(Arrays.asList(people)));
    }
}

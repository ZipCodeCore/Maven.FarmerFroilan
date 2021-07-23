package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animals.person.Person;

import java.util.List;

public class FarmHouse extends Shelter<Person> {

    public FarmHouse() {
    }

    public FarmHouse(List<Person> people) {
        super.setAnimals(people);
    }
}

package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse implements Shelter<Person> {

    List<Person> personList = new ArrayList<Person>();
    Person person;

    public void add(Person thingToBeStored) {
        personList.add(thingToBeStored);
    }

    public Person getTypeByName(String name) {
        return person.getName();
    }

    public void remove(Person thingToBeStored) {
        personList.remove(thingToBeStored);
    }
}

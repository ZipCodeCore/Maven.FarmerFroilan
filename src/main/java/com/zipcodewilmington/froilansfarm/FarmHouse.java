package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse implements Shelter<Person> {

    List<Person> personList = new ArrayList<Person>();
    Person person;

    public void add(Person person) {
        personList.add(person);
    }

    public Person getTypeByName(String name) {
        return person.getName();
    }

    public void remove(Person person) {
        personList.remove(person);
    }
}

package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse implements Shelter<Person> {

    List<Person> personList = new ArrayList<Person>();
    Person person;

    public FarmHouse(Person person) {
        this.person = person;
        this.personList = personList;
    }

    public FarmHouse() {}

    public void add(Person person) {
        personList.add(person);
    }

    public Person getObjectByName(String name) {
        Person thisPerson = new Person();
        for(Person person : personList) {
            if(person.equals(name)) {
                thisPerson = person;
            }
        }
        return thisPerson;
    }

    public void remove(Person person) {
        personList.remove(person);
    }
}

package com.zipcodewilmington.froilansfarm.Structure;

import com.zipcodewilmington.froilansfarm.Mammal.Person;
import com.zipcodewilmington.froilansfarm.Shelter;

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
        for(Person element : personList) {
            if(element.equals(name)) {
                person = element;
            }
        }
        return person;
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public List<Person> getPersonList() {
        return personList;
    }
}

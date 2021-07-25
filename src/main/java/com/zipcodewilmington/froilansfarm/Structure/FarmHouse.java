package com.zipcodewilmington.froilansfarm.Structure;

import com.zipcodewilmington.froilansfarm.Mammal.Froilan;
import com.zipcodewilmington.froilansfarm.Mammal.Person;
import com.zipcodewilmington.froilansfarm.Shelter;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse implements Shelter<Person> {

    List<Person> personList = new ArrayList<Person>();

    public FarmHouse() {}

    public void add(Person person) {
        personList.add(person);
    }

    public Person getObjectByName(String name) {
        for(Person person : personList) {
            if(person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public Person getFroi(){
        Froilan froi = (Froilan) getObjectByName("Froilan");
        return froi;
    }
}

package com.zipcodewilmington.froilansfarm.animals.person;

import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.farm.FarmStorage;

public class Person extends Animal {

    private String name;

    public Person() {
    }

    public Person (String name){
        this.name = name;
    }

    public String makeNoise() {

       return null;
    }

    public void setName(String name){
       this.name = name;
    }

    public String getName() {
        return name;
    }
}

package com.zipcodewilmington.froilansfarm.animals.person;

import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.crops.Edible;

public class Person extends Animal {

    private String name;

    public Person() {

    }

    public Person (String name){
        setName(name);
    }


    public String makeNoise() {

       return null;
    }

    public Boolean eat(Edible food) {

        return null;
    }

    public void setName(String name){
       this.name = name;
    }

    public String getName() {
        return name;
    }


}

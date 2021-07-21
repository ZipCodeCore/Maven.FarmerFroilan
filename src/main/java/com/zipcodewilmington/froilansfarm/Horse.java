package com.zipcodewilmington.froilansfarm;

//Horse can only eat Earcorn right now
// < Parameter type goes in here, "extends" - limits what the parameter type can be >

public class Horse extends Animal <EarCorn> implements Ridable {

    public Horse(String name) {
        super(name);
    }

    public Horse() { }

    public void ride() {

    }
}

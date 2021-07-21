package com.zipcodewilmington.froilansfarm;

public class Farm {
    private static Shelter<Person> farmhouse;
    private static Shelter<Horse> stable;
    private static Shelter<Chicken> chickenCoop;

    public Farm(){

    }

    public static Shelter<Person> getFarmhouse() {
        return farmhouse;
    }

    public static Shelter<Horse> getStable() {
        return stable;
    }

    public static Shelter<Chicken> getChickenCoop() {
        return chickenCoop;
    }
}

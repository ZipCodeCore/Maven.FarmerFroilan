package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import com.zipcodewilmington.froilansfarm.Mammal.Farmer;
import com.zipcodewilmington.froilansfarm.Mammal.Horse;
import com.zipcodewilmington.froilansfarm.Mammal.Person;
import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Structure.FarmHouse;
import com.zipcodewilmington.froilansfarm.Structure.Stable;

public class Farm {
    private  Shelter<Person> farmhouse = new FarmHouse();
    private  Shelter<Horse> stable = new Stable();
    private  Shelter<Chicken> chickenCoop = new ChickenCoop();
    private  Field field = new Field();

    public Farm(){
        farmhouse.add(new Farmer("Froilan"));
        farmhouse.add(new Farmer("Froilanda"));
        stable.add(new Horse("Fork"));
        stable.add(new Horse("Spoon"));
        chickenCoop.add(new Chicken("Chicolate"));
        chickenCoop.add(new Chicken("Eggward"));
        field.add(new CropRow());
        field.add(new CropRow());
    }

    public  Shelter<Person> getFarmhouse() {
        return farmhouse;
    }

    public  Shelter<Horse> getStable() {
        return stable;
    }

    public  Shelter<Chicken> getChickenCoop() {
        return chickenCoop;
    }

    public Field getField(){
        return field;
    }
}

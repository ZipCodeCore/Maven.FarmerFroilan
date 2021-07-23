package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Food.CarrotFlower;
import com.zipcodewilmington.froilansfarm.Food.CornStalk;
import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Food.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import com.zipcodewilmington.froilansfarm.Mammal.Farmer;
import com.zipcodewilmington.froilansfarm.Mammal.Horse;
import com.zipcodewilmington.froilansfarm.Mammal.Person;
import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Structure.FarmHouse;
import com.zipcodewilmington.froilansfarm.Structure.Stable;

import java.util.Arrays;

public class Farm {
    private Shelter<Person> farmhouse = new FarmHouse();

    private Shelter<Horse> stable1 = new Stable();
    private Shelter<Horse> stable2 = new Stable();
    private Shelter<Horse> stable3 = new Stable();

    private Shelter<Chicken> chickenCoop1 = new ChickenCoop();
    private Shelter<Chicken> chickenCoop2 = new ChickenCoop();
    private Shelter<Chicken> chickenCoop3 = new ChickenCoop();

    private Field field = new Field();

    public Farm(){
        populateFarmHouse();
        populateAllChickenCoops();
        populateAllStables();
        populateField();
    }

    public Shelter<Person> getFarmhouse() {
        return farmhouse;
    }

    public Shelter<Horse> getStable1() {
        return stable1;
    }

    public Shelter<Horse> getStable2() {
        return stable2;
    }

    public Shelter<Horse> getStable3() {
        return stable3;
    }

    public Shelter<Chicken> getChickenCoop1() {
        return chickenCoop1;
    }

    public Shelter<Chicken> getChickenCoop2() {
        return chickenCoop2;
    }

    public Shelter<Chicken> getChickenCoop3() {
        return chickenCoop3;
    }

    public Field getField(){
        return field;
    }

    private void populateAllStables(){
        Arrays
                .asList("Party Skips Frank Greta".split(" "))
                .forEach(name -> stable1.add(new Horse(name)));
        Arrays
                .asList("Yorgle Spoon Fork".split(" "))
                .forEach(name -> stable2.add(new Horse(name)));
        Arrays
                .asList("Harry Milo Hoovey".split(" "))
                .forEach(name -> stable3.add(new Horse(name)));
    }

    private void populateAllChickenCoops(){
        Arrays
                .asList("Felipe", "Oscar", "Marvey", "Lorraine", "Sally", "Lil peep")
                .forEach(name ->chickenCoop1.add(new Chicken(name)));
        Arrays
                .asList("Eggetha Christie Dr. Bawk Chicklette Mz. Cluck Chicolate".split(""))
                .forEach(name -> chickenCoop2.add(new Chicken(name)));
        Arrays
                .asList("Harry Meghen Amantha Christephanie Henrietta Eggward".split(" "))
                .forEach(name -> chickenCoop3.add(new Chicken(name)));
    }

    private void populateField(){
        CropRow row1 = new CropRow();
        row1.plantCrop(new CornStalk());
        field.add(row1);

        CropRow row2 = new CropRow();
        row2.plantCrop(new TomatoPlant());
        field.add(row2);

        CropRow row3 = new CropRow();
        row3.plantCrop(new CarrotFlower());
        field.add(row3);

        CropRow row4 = new CropRow();
        row4.plantCrop(new CornStalk());
        field.add(row4);

        CropRow row5 = new CropRow();
        row5.plantCrop(new TomatoPlant());
        field.add(row5);

    }

    public void populateFarmHouse(){
        farmhouse.add(new Farmer("Froilan"));
        farmhouse.add(new Farmer("Froilanda"));
    }
}

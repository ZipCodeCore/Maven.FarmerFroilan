package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Food.CarrotFlower;
import com.zipcodewilmington.froilansfarm.Food.CornStalk;
import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Food.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Mammal.*;
import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Structure.FarmHouse;
import com.zipcodewilmington.froilansfarm.Structure.Pantry;
import com.zipcodewilmington.froilansfarm.Structure.Stable;
import com.zipcodewilmington.froilansfarm.Vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import java.util.Arrays;
import java.util.List;

public class Farm {
    private Shelter<Person> farmhouse = new FarmHouse();
    private List<Shelter<Horse>>  stables = Arrays.asList(
            new Stable(),
            new Stable(),
            new Stable());
    private List<Shelter<Chicken>> chickenCoops = Arrays.asList(
            new ChickenCoop(),
            new ChickenCoop(),
            new ChickenCoop());
    private Field field = new Field();
    private CropDuster cropDuster = new CropDuster();
    private Tractor tractor = new Tractor();
    private Tractor johnDeer = new Tractor();
    private Pantry pantry;

    public Farm(){
        populateFarmHouse();
        populateAllChickenCoops();
        populateAllStables();
        populateField();
        this.pantry = new Pantry();
    }

    public Shelter<Person> getFarmhouse() {
        return farmhouse;
    }

    public List<Shelter<Horse>> getStables() {
        return stables;
    }

    public List<Shelter<Chicken>> getChickenCoops() {
        return chickenCoops;
    }

    public Field getField(){
        return field;
    }

    public CropDuster getCropDuster() {
        return cropDuster;
    }

    public Tractor getTractor() {
        return tractor;
    }

    public Tractor getJohnDeer() {
        return johnDeer;
    }

    private void populateAllStables(){
        Arrays
                .asList("Party Skips Frank Greta".split(" "))
                .forEach(name -> stables.get(0).add(new Horse(name)));
        Arrays
                .asList("Yorgle Spoon Fork".split(" "))
                .forEach(name -> stables.get(1).add(new Horse(name)));
        Arrays
                .asList("Harry Milo Hoovey".split(" "))
                .forEach(name -> stables.get(2).add(new Horse(name)));
    }

    private void populateAllChickenCoops(){
        Arrays
                .asList("Felipe", "Oscar", "Marvey", "Lorraine", "Sally", "Lil peep")
                .forEach(name ->chickenCoops.get(0).add(new Chicken(name)));
        Arrays
                .asList("Eggetha Christie Dr. Bawk Chicklette Mz. Cluck Chicolate".split(""))
                .forEach(name -> chickenCoops.get(1).add(new Chicken(name)));
        Arrays
                .asList("Harry Meghen Amantha Christephanie Henrietta Eggward".split(" "))
                .forEach(name -> chickenCoops.get(2).add(new Chicken(name)));
    }

    private void populateField(){
        Arrays
                .asList(new CornStalk(),new TomatoPlant(), new CarrotFlower(), new CornStalk(), new TomatoPlant())
                .forEach(crop -> {
                    CropRow row = new CropRow();
                    row.plantCrop(crop);
                    field.add(row);
                });
    }

    public void populateFarmHouse(){
        Froilanda msFroid = Froilanda.getInstance();
        Froilan mrFroid = Froilan.getInstance();
        farmhouse.add(msFroid);
        farmhouse.add(mrFroid);
    }

    public Pantry getPantry() {
        return pantry;
    }
}

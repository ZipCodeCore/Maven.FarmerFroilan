package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.Food.*;
import com.zipcodewilmington.froilansfarm.Mammal.*;
import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Structure.Stable;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weekdays {
    private Farm farm = new Farm();

    public Weekdays(Farm farm){
        this.farm = farm;
    }

    Froilan froilan = (Froilan) farm.getFarmhouse().getObjectByName("Froilan");
    Froilanda froilanda = Froilanda.getInstance();

    List<Shelter<Horse>> stables = farm.getStables();
    List<Shelter<Chicken>> chickenCoops = farm.getChickenCoops();

    EarCorn earCorn = new EarCorn();
    CornStalk cornStalk = new CornStalk();
    TomatoPlant tomatoPlant = new TomatoPlant();
    CropRow cropRow = new CropRow();

    CropDuster cropDuster = farm.getCropDuster();
    Tractor tractor = farm.getTractor();

    public void sunday() {
        List<CropRow> cropRows = farm.getField().getMyField();
        morningRoutine(farm);
        froilan.plantRows(farm.getField());
        lunch();
        dinner();
    }

    public void monday() {
        morningRoutine(farm);
        froilanda.mount(cropDuster);
        froilanda.fly(farm);
        lunch();
        dinner();
    }

    public void tuesday() {
        morningRoutine(farm);
        froilan.mount(tractor);
        tractor.operate(farm);
        lunch();
        dinner();
    }

    public void wednesday() {
        List<CropRow> cropRows = farm.getField().getMyField();
        morningRoutine(farm);
        froilan.plantRows(farm.getField());
        lunch();
        dinner();
    }

    public void thursday() {
        morningRoutine(farm);
        froilan.mount(tractor);
        tractor.operate(farm);
        lunch();
        dinner();
    }

    public void friday() {
        List<CropRow> cropRows = farm.getField().getMyField();
        morningRoutine(farm);
        froilan.plantRows(farm.getField());
        lunch();
        dinner();
    }

    public void saturday() {
        morningRoutine(farm);
        lunch();
        dinner();
    }

    public void morningRoutine(Farm farm) {
        for (int i = 0; i < stables.size(); i++) {
            Stable stable = (Stable) stables.get(i);
            for (Horse horse : stable.getHorseList()) {
                horse.eat(new EarCorn(), new EarCorn(), new EarCorn());
                froilan.mount(horse);
                horse.ride(froilan);
            }
        }

        for(int i = 0; i < chickenCoops.size(); i++) {
            ChickenCoop coop = (ChickenCoop) chickenCoops.get(i);
            List<Edible> x = farm.getPantry().takeEarCorn(1);
            coop.getChickenList().forEach(chicken -> chicken.eat((EarCorn) x));
        }


        List<Edible> breakFast = farm.getPantry().takeEarCorn(1);
        breakFast.addAll(farm.getPantry().takeTomato(2));
        breakFast.addAll(farm.getPantry().takeEgg(5));
        froilan.eat(breakFast);
        breakFast = farm.getPantry().takeEarCorn(2);
        breakFast.addAll(farm.getPantry().takeTomato(1));
        breakFast.addAll(farm.getPantry().takeEgg(2));
        froilanda.eat(breakFast);

    }

    public void lunch() {
        List<Edible> lunch = farm.getPantry().takeCarrot(2);
        lunch.addAll(farm.getPantry().takeTomato(3));
        lunch.addAll(farm.getPantry().takeEgg(3));
        froilan.eat(lunch);
        lunch = farm.getPantry().takeEarCorn(1);
        lunch.addAll(farm.getPantry().takeCarrot(3));
        lunch.addAll(farm.getPantry().takeEgg(2));
        froilanda.eat(lunch);
    }

    public void dinner() {
        List<Edible> dinner = farm.getPantry().takeCarrot(1);
        dinner.addAll(farm.getPantry().takeEarCorn(1));
        dinner.addAll(farm.getPantry().takeTomato(2));
        dinner.addAll(farm.getPantry().takeEgg(2));
        froilan.eat(dinner);
        dinner = farm.getPantry().takeCarrot(1);
        dinner.addAll(farm.getPantry().takeEarCorn(1));
        dinner.addAll(farm.getPantry().takeTomato(2));
        dinner.addAll(farm.getPantry().takeEgg(2));
        froilanda.eat(dinner);
    }
}

package com.zipcodewilmington.froilansfarm;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import com.zipcodewilmington.froilansfarm.Food.*;
import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import com.zipcodewilmington.froilansfarm.Mammal.Froilan;
import com.zipcodewilmington.froilansfarm.Mammal.Froilanda;
import com.zipcodewilmington.froilansfarm.Mammal.Horse;
import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Structure.Stable;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.graalvm.compiler.hotspot.replacements.InstanceOfSnippets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weekdays {

    Farm farm = new Farm();

    Froilan froilan = new Froilan();
    Froilanda froilanda = Froilanda.getInstance();

    Stable stable = new Stable();
    ChickenCoop chickenCoop = new ChickenCoop();

    EarCorn earCorn = new EarCorn();
    CornStalk cornStalk = new CornStalk();
    TomatoPlant tomatoPlant = new TomatoPlant();
    CropRow cropRow = new CropRow();

    CropDuster cropDuster = new CropDuster();
    Tractor tractor = new Tractor();

    public void sunday() {
        List<CropRow> cropRows = farm.getField().getMyField();
        morningRoutine();
        froilan.plantRows(farm.getField());
        lunch();
        dinner();
    }

    public void monday() {
        morningRoutine();
        froilanda.mount(cropDuster);
        froilanda.fly(farm);
        lunch();
        dinner();
    }

    public void tuesday() {
        morningRoutine();
        froilan.mount(tractor);
        tractor.operate(farm);
        lunch();
        dinner();
    }

    public void wednesday() {
        List<CropRow> cropRows = farm.getField().getMyField();
        morningRoutine();
        froilan.plantRows(farm.getField());
        lunch();
        dinner();
    }

    public void thursday() {
        morningRoutine();
        froilan.mount(tractor);
        tractor.operate(farm);
        lunch();
        dinner();
    }

    public void friday() {
        List<CropRow> cropRows = farm.getField().getMyField();
        morningRoutine();
        froilan.plantRows(farm.getField());
        lunch();
        dinner();
    }

    public void saturday() {
        morningRoutine();
        lunch();
        dinner();
    }

    public void morningRoutine() {
        for(Horse horse : stable.getHorseList()) {
            froilan.mount(horse);
            horse.ride(froilan);
        }
        for(Horse horse : stable.getHorseList()) {
            horse.eat(new EarCorn(), new EarCorn(), new EarCorn());
        }
        for(Chicken chicken : chickenCoop.getChickenList()) {
            chicken.eat(earCorn);
        }
        froilan.eat(new EarCorn(), new Tomato(), new Tomato(), new Egg(), new Egg(), new Egg(), new Egg(), new Egg());
        froilanda.eat(new EarCorn(), new EarCorn(), new Tomato(), new Egg(), new Egg());

    }

    public void lunch() {
        froilan.eat(new Carrot(), new Carrot(), new Tomato(), new Tomato(), new Tomato(), new Egg(), new Egg(), new Egg());
        froilanda.eat(new EarCorn(), new Carrot(), new Carrot(), new Carrot(), new Egg(), new Egg());
    }

    public void dinner() {
        froilan.eat(new EarCorn(), new Tomato(), new Tomato(), new Carrot(), new Egg(), new Egg());
        froilanda.eat(new EarCorn(), new Tomato(), new Tomato(), new Carrot(), new Egg(), new Egg());
    }
}

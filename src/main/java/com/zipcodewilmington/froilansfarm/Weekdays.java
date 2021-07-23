package com.zipcodewilmington.froilansfarm;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import com.zipcodewilmington.froilansfarm.Food.*;
import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import com.zipcodewilmington.froilansfarm.Mammal.Froilan;
import com.zipcodewilmington.froilansfarm.Mammal.Froilanda;
import com.zipcodewilmington.froilansfarm.Mammal.Horse;
import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Structure.Stable;
import org.graalvm.compiler.hotspot.replacements.InstanceOfSnippets;

import java.util.Arrays;

public class Weekdays {

    Froilan froilan = new Froilan();
    Froilanda froilanda = Froilanda.getInstance();

    Stable stable = new Stable();
    ChickenCoop chickenCoop = new ChickenCoop();

    EarCorn earCorn = new EarCorn();
    CornStalk cornStalk = new CornStalk();

    public void sunday() {
        morningRoutine();
        froilan.plant(cornStalk, );
    }

    public void monday() {

    }

    public void tuesday() {

    }

    public void wednesday() {

    }

    public void thursday() {

    }

    public void friday() {

    }

    public void saturday() {

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

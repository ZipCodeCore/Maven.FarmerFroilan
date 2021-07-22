package com.zipcodewilmington.froilansfarm.Mammal;

import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Food.Produce;

import java.util.ArrayList;
import java.util.List;

public class Chicken extends Animal<EarCorn> implements Edible, Produce {

    public List<Edible> meals = new ArrayList<>();

    public Chicken(String name) {
        super(name);
        this.meals = meals;
    }

    public Chicken() { }

    @Override
    public String makeNoise() {
        return "Cluck Cluck";
    }

    @Override
    public Egg yield() {
        if (!Egg.isFertilized){
            return new Egg();
        }
        return null;
    }

    public void eat(EarCorn earCorn) {
        meals.add(earCorn);
        //need a way to remove EarCorn count as well
    }

    public List<Edible> getMealList() { return meals; }

}

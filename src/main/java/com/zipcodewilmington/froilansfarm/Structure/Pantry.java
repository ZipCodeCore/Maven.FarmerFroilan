package com.zipcodewilmington.froilansfarm.Structure;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Food.Carrot;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Food.Tomato;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pantry {
    private List<Carrot> carrotsBasket = new ArrayList<>();
    private List<EarCorn> earCornsBasket = new ArrayList<>();
    private List<Egg> eggsBasket = new ArrayList<>();
    private List<Tomato> tomatoesBasket = new ArrayList<>();

    public Pantry(){
        populateCarrots();
        populateEarCorns();
        populateEggs();
        populateTomatoes();
    }

    public Integer countCarrots() {
        return carrotsBasket.size();
    }

    public void storeCarrot(Carrot carrot) {
        this.carrotsBasket.add(carrot);
    }

    public List<Edible> takeCarrot(Integer count){
        Carrot[] result = new Carrot[count];
        for (int i = 0; i < count; i++) {
            result[i] = this.carrotsBasket.remove(0);
        }
        return Arrays.asList(result);
    }

    public Integer countEarCorns() {
        return earCornsBasket.size();
    }

    public void storeEarCorn(EarCorn earCorn) {
        this.earCornsBasket.add(earCorn);
    }

    public List<Edible> takeEarCorn(Integer count){
        EarCorn[] result = new EarCorn[count];
        for (int i = 0; i < count; i++) {
            result[i] = this.earCornsBasket.remove(0);
        }
        return Arrays.asList(result);
    }

    public Integer countEggs() {
        return eggsBasket.size();
    }

    public void storeEgg(Egg egg) {
        this.eggsBasket.add(egg);
    }

    public List<Edible> takeEgg(Integer count){
        Egg[] result = new Egg[count];
        for (int i = 0; i < count; i++) {
            result[i] = this.eggsBasket.remove(0);
        }
        return Arrays.asList(result);
    }

    public Integer countTomatoes() {
        return tomatoesBasket.size();
    }

    public void storeTomato(Tomato tomato) {
        this.tomatoesBasket.add(tomato);
    }

    public List<Edible> takeTomato(Integer count){
        Tomato[] result = new Tomato[count];
        for (int i = 0; i < count; i++) {
            result[i] = this.tomatoesBasket.remove(0);
        }
        return Arrays.asList(result);
    }

    public void populateCarrots(){
        for (int i = 0; i < 100; i++) {
            this.storeCarrot(new Carrot());
        }
    }
    public void populateEarCorns(){
        for (int i = 0; i < 100; i++) {
            this.storeEarCorn(new EarCorn());
        }
    }
    public void populateEggs(){
        for (int i = 0; i < 100; i++) {
            this.storeEgg(new Egg());
        }
    }
    public void populateTomatoes(){
        for (int i = 0; i < 100; i++) {
            this.storeTomato(new Tomato());
        }
    }
}

//
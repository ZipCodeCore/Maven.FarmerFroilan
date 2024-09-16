package com.zipcodewilmington.froilansfarm.testStorage;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.storage.Farm;
import com.zipcodewilmington.froilansfarm.storage.Stable;
import com.zipcodewilmington.froilansfarm.storage.StorageInterface;
import org.junit.Assert;
import org.junit.Test;

public class FarmTest {


    @Test
    public void addTest () {
     Farm farm = new Farm();
     Horse horse = new Horse();
     Horse horse1 = new Horse();
     Integer expected = 2;

     farm.addShelter(horse);
     farm.addShelter(horse1);
     Integer actual = farm.amountShelter();

     Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest () {
        Farm farm = new Farm();
        Horse horse = new Horse();
        Horse horse1 = new Horse();
        Integer expected = 1;

        farm.addShelter(horse);
        farm.addShelter(horse1);
        farm.removeShelter(horse1);
        Integer actual = farm.amountShelter();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void amountTest () {
        Farm farm = new Farm();
        Horse horse = new Horse();
        Horse horse1 = new Horse();
        Integer expected = 2;

        farm.addShelter(horse);
        farm.addShelter(horse1);
        Integer actual = farm.amountShelter();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAmountOfCoopsTest () {
        Farm farm = new Farm();
        ChickenCoop chicken = new ChickenCoop();
        ChickenCoop chicken1 = new ChickenCoop();
        Stable stable = new Stable();
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Integer expected = 2;

        farm.addShelter(chicken);
        farm.addShelter(chicken1);
        farm.addShelter(stable);
        farm.addShelter(stable1);
        farm.addShelter(stable2);
        Integer actual = farm.getAmountofCoops();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAmountOfStableTest () {
        Farm farm = new Farm();
        ChickenCoop chicken = new ChickenCoop();
        ChickenCoop chicken1 = new ChickenCoop();
        Stable stable = new Stable();
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Integer expected = 3;

        farm.addShelter(chicken);
        farm.addShelter(chicken1);
        farm.addShelter(stable);
        farm.addShelter(stable1);
        farm.addShelter(stable2);
        Integer actual = farm.getAmountofStable();

        Assert.assertEquals(expected, actual);
    }
}

package com.zipcodewilmington.froilansfarm.testStorage;

import Animal.Chicken;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.storage.StorageInterface;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {

    @Test
    public void implementTest () {
        ChickenCoop cc = new ChickenCoop();

        Assert.assertTrue(cc instanceof StorageInterface);
    }

    @Test
    public void addTest () {
        ChickenCoop cc = new ChickenCoop();
        Chicken chicken = new Chicken();
        Integer expected = 1;

        cc.add(chicken);
        Integer actual = cc.getListOfChicken();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest () {
        ChickenCoop cc = new ChickenCoop();
        Chicken chicken = new Chicken();
        Chicken chicken1 = new Chicken();
        Integer expected = 1;

        cc.add(chicken);
        cc.add(chicken1);
        cc.remove(chicken);
        Integer actual = cc.getListOfChicken();

        Assert.assertEquals(expected, actual);
        // I return an extra chicken, oops
    }

    @Test
    public void amountTest () {
        ChickenCoop cc = new ChickenCoop();
        Chicken chicken = new Chicken();
        Chicken chicken1 = new Chicken();
        Integer expected = 2;

        cc.add(chicken);
        cc.add(chicken1);
        Integer actual = cc.getListOfChicken();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getChickenCoopTest () {
        ChickenCoop cc = new ChickenCoop();
        Chicken chicken = new Chicken();
        Chicken chicken1 = new Chicken();
        Integer expected = 2;

        cc.add(chicken);
        cc.add(chicken1);
        Integer actual = cc.getListOfChicken();

        Assert.assertEquals(expected, actual);
    }
}

package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {

    @Test
    public void testAdd() {
        //given
        Chicken chicken = new Chicken("Harry");
        //when
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.add(chicken);
        //then
        Assert.assertTrue(chickenCoop.getChickenList().contains(chicken));
    }

    @Test
    public void testRemove() {
        //given
        Chicken chicken1 = new Chicken("Harry");
        Chicken chicken2 = new Chicken("Megan");
        //when
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.add(chicken1);
        chickenCoop.add(chicken2);
        chickenCoop.remove(chicken1);
        //then
        Assert.assertFalse(chickenCoop.getChickenList().contains(chicken1));
    }

    @Test
    public void testImplementation() {
        ChickenCoop chickenCoop = new ChickenCoop();
        Assert.assertTrue(chickenCoop instanceof Shelter);
    }
}

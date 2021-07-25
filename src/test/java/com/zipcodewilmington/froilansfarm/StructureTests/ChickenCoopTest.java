package com.zipcodewilmington.froilansfarm.StructureTests;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {

    @Test
    public void testConstructor() {
        //given
        String expected = "Frank";
        Chicken chicken = new Chicken(expected);
        //when
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.add(chicken);
        //then
        Assert.assertTrue(chickenCoop.getChickenList().contains(chicken));
    }

    @Test
    public void testGetObjectByName() {
        //given
        String name = "Frank";
        Chicken expected = new Chicken(name);
        //when
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.add(expected);
        Chicken actual = chickenCoop.getObjectByName(name);
        //then
        Assert.assertTrue(expected.equals(actual));
    }

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

    @Test
    public void elementTest() {

        //Given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken actual = chickenCoop.getObjectByName("Felipe");
        Assert.assertNull(actual);
        chickenCoop.add(new Chicken("Felipe"));

        //When
        actual = chickenCoop.getObjectByName("Felipe");

        //Then
        Assert.assertNotNull(actual);
    }
}

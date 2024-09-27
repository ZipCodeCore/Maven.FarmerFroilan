package com.zipcodewilmington.froilansfarm.StructureTests;

import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import com.zipcodewilmington.froilansfarm.Mammal.Horse;
import com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Structure.Stable;
import org.junit.Assert;
import org.junit.Test;

public class StableTest {

    @Test
    public void testConstructor() {
        //given
        String expected = "Judy";
        Horse horse = new Horse(expected);
        //when
        Stable stable = new Stable();
        stable.add(horse);
        //then
        Assert.assertTrue(stable.getHorseList().contains(horse));
    }

    @Test
    public void testGetObjectByName() {
        //given
        String name = "Frank";
        Horse expected = new Horse(name);
        //when
        Stable stable = new Stable();
        stable.add(expected);
        Horse actual = stable.getObjectByName(name);
        //then
        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void testAdd() {
        //given
        Horse horse = new Horse("Annabell");
        //when
        Stable stable = new Stable();
        stable.add(horse);
        //then
        Assert.assertTrue(stable.getHorseList().contains(horse));
    }

    @Test
    public void testRemove() {
        //given
        Horse horse1 = new Horse("Annabell");
        Horse horse2 = new Horse("Ruth");
        //when
        Stable stable = new Stable();
        stable.add(horse1);
        stable.add(horse2);
        stable.remove(horse1);
        //then
        Assert.assertFalse(stable.getHorseList().contains(horse1));
    }

    @Test
    public void testImplementation() {
        Stable stable = new Stable();
        Assert.assertTrue(stable instanceof Shelter);
    }
    @Test
    public void elementTest() {

        //Given
        Stable stable = new Stable();
        Horse actual = stable.getObjectByName("Spoon");
        Assert.assertNull(actual);
        stable.add(new Horse("Spoon"));

        //When
        actual = stable.getObjectByName("Spoon");

        //Then
        Assert.assertNotNull(actual);
    }
}

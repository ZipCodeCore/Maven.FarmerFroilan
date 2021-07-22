package com.zipcodewilmington.froilansfarm.MammalTests;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Mammal.Animal;
import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import com.zipcodewilmington.froilansfarm.Mammal.Farmer;
import com.zipcodewilmington.froilansfarm.Mammal.Horse;
import com.zipcodewilmington.froilansfarm.Rideable;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void testConstructor() {
        //given
        String expected = "Cyan";
        //when
        Horse horse = new Horse(expected);
        String actual = horse.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        //given
        String expected = "Spring";
        //when
        Horse horse = new Horse(expected);
        String actual = horse.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMakeNoise() {
        //given
        String expected = "Neigh";
        //when
        Horse horse = new Horse();
        String actual = horse.makeNoise();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRide() {
        //given
        Horse horse = new Horse();
        Farmer farmer = new Farmer();
        //when
        horse.ride(farmer);
        //then


    }

    @Test
    public void testEat() {
        //given
        Horse horse = new Horse();
        //when
        EarCorn earCorn = new EarCorn();
        horse.eat(earCorn);
        horse.getMealList();
        //then
        Assert.assertTrue(horse.meals.contains(earCorn));
    }

    @Test
    public void testInheritance() {
        Horse horse = new Horse("Harvey");
        Assert.assertTrue(horse instanceof Animal);
    }

    @Test
    public void testImplementation() {
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Rideable);
    }
}

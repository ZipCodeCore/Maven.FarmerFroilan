package com.zipcodewilmington.froilansfarm.MammalTests;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Mammal.Animal;
import com.zipcodewilmington.froilansfarm.Mammal.Horse;
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
    public void testInheritance() {
        Horse horse = new Horse("Harvey");
        Assert.assertTrue(horse instanceof Animal);
    }
}

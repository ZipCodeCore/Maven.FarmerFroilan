package com.zipcodewilmington.froilansfarm.MammalTests;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Mammal.Animal;
import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void testConstructor() {
        //given
        String expected = "Franklin";
        //when
        Chicken chicken = new Chicken(expected);
        String actual = chicken.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        //given
        String expected = "Theodore";
        //when
        Chicken chicken = new Chicken(expected);
        String actual = chicken.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {
        Chicken chicken = new Chicken("Clucks");
        Assert.assertTrue(chicken instanceof Animal);
    }

    @Test
    public void testImplementation() {
        Chicken chicken = new Chicken("Fluffers");
        Assert.assertTrue(chicken instanceof Edible);
    }
}

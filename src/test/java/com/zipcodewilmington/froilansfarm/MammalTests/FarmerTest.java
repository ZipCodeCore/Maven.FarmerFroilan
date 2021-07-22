package com.zipcodewilmington.froilansfarm.MammalTests;

import com.zipcodewilmington.froilansfarm.Botanist;
import com.zipcodewilmington.froilansfarm.Mammal.Farmer;
import com.zipcodewilmington.froilansfarm.Mammal.Person;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void testSetName() {
        //given
        String expected = "Froiland";
        Person person = new Farmer(expected);
        //when
        String actual = person.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {
        Farmer farmer = new Farmer("Annette");
        Assert.assertTrue(farmer instanceof Person);
    }

    @Test
    public void testImplementation() {
        Farmer farmer = new Farmer("Joe");
        Assert.assertTrue(farmer instanceof Botanist);
    }
}

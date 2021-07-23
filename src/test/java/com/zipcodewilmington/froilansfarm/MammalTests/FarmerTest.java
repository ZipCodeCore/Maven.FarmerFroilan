package com.zipcodewilmington.froilansfarm.MammalTests;

import com.zipcodewilmington.froilansfarm.Botanist;
import com.zipcodewilmington.froilansfarm.Food.Crop;
import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Food.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Mammal.Farmer;
import com.zipcodewilmington.froilansfarm.Mammal.Horse;
import com.zipcodewilmington.froilansfarm.Mammal.Person;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void testconstructor() {
        //given
        String expected = "Froilanda";
        //when
        Farmer farmer = new Farmer(expected);
        String actual = farmer.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

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
    public void testMakeNoise() {
        //given
        String expected = "Howdy";
        //when
        Farmer farmer = new Farmer();
        String actual = farmer.makeNoise();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMount() {
        //given
        Horse horse = new Horse();
        Rideable expected = horse;
        //when
        Farmer farmer = new Farmer();
        farmer.mount(horse);
        Rideable actual = farmer.getIsRiding();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDismount() {
        //given
        Horse horse = new Horse();
        //when
        Farmer farmer = new Farmer();
        farmer.mount(horse);
        farmer.dismount(horse);
        //then
        Assert.assertNull(farmer.getIsRiding());
    }

    @Test
    public void testEat() {
        //given
        Farmer farmer = new Farmer();
        //when
        Tomato tomato = new Tomato();
        farmer.eat(tomato);
        farmer.getMealList();
        //then
        Assert.assertTrue(farmer.meals.contains(tomato));
    }

    @Test
    public void testInheritance() {
        Farmer farmer = new Farmer("Annette");
        Assert.assertTrue(farmer instanceof Person);
    }

    @Test
    public void testImplementationRider() {
        Farmer farmer = new Farmer("Joe");
        Assert.assertTrue(farmer instanceof Rider);
    }
}

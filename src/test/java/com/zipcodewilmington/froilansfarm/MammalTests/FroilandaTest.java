package com.zipcodewilmington.froilansfarm.MammalTests;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Mammal.Farmer;
import com.zipcodewilmington.froilansfarm.Mammal.Froilanda;
import com.zipcodewilmington.froilansfarm.Mammal.Horse;
import com.zipcodewilmington.froilansfarm.Pilot;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class FroilandaTest {
    @Test
    public void testconstructor() {
        //given
        String expected = "Froilanda";
        //when
        Froilanda froilanda = Froilanda.getInstance();
        String actual = froilanda.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        //given
        String expected = "Froilanda";
        Froilanda froilanda = Froilanda.getInstance();
        //when
        String actual = froilanda.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMakeNoise() {
        //given
        String expected = "Howdy";
        //when
        Froilanda froilanda = Froilanda.getInstance();
        String actual = froilanda.makeNoise();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMount() {
        //given
        Horse horse = new Horse();
        Rideable expected = horse;
        //when
        Froilanda froilanda = Froilanda.getInstance();
        froilanda.mount(horse);

        Rideable actual = froilanda.getIsRiding();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDismount() {
        //given
        Horse horse = new Horse();
        //when
        Froilanda froilanda = Froilanda.getInstance();
        froilanda.mount(horse);
        froilanda.dismount(horse);
        //then
        Assert.assertNull(froilanda.getIsRiding());
    }

    @Test
    public void testEat() {
        //given
        Froilanda froilanda = Froilanda.getInstance();
        //when
        Tomato tomato = new Tomato();
        froilanda.eat(tomato);
        froilanda.getMealList();
        //then
        Assert.assertTrue(froilanda.meals.contains(tomato));
    }

    @Test
    public void testFly() {
        //given
        Froilanda froilanda = Froilanda.getInstance();
        CropDuster cropDuster = new CropDuster();
        Farm farm = new Farm();
        Assert.assertFalse(farm
                .getField()
                .getMyField()
                .get(0)
                .getCropList()
                .get(0)
                .checkFertilized());
        //when
        froilanda.mount(cropDuster);
        froilanda.fly(farm);
        //then
        Assert.assertTrue(farm
                .getField()
                .getMyField()
                .get(0)
                .getCropList()
                .get(0)
                .checkFertilized());
    }

    @Test
    public void testInheritance() {
        Froilanda froilanda = Froilanda.getInstance();
        Assert.assertTrue(froilanda instanceof Farmer);
    }

    @Test
    public void testImplementationBotanist() {
        Froilanda froilanda = Froilanda.getInstance();
        Assert.assertTrue(froilanda instanceof Pilot);
    }
}

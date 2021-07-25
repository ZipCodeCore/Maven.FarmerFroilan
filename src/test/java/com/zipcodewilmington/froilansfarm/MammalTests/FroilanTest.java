package com.zipcodewilmington.froilansfarm.MammalTests;

import com.zipcodewilmington.froilansfarm.Botanist;
import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Food.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Mammal.Farmer;
import com.zipcodewilmington.froilansfarm.Mammal.Froilan;
import com.zipcodewilmington.froilansfarm.Mammal.Horse;
import com.zipcodewilmington.froilansfarm.Mammal.Person;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;
import org.junit.Assert;
import org.junit.Test;

public class FroilanTest {

    @Test
    public void testconstructor() {
        //given
        String expected = "Froilan";
        //when
        Froilan froilan = Froilan.getInstance();
        String actual = froilan.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        //given
        String expected = "Froilan";
        Froilan froilan = Froilan.getInstance();
        //when
        String actual = froilan.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPlant() {
        //given
        TomatoPlant tomatoPlant = new TomatoPlant(0);
        CropRow cropRow = new CropRow();
        Froilan farmer = Froilan.getInstance();
        //when
        farmer.plant(tomatoPlant, cropRow);
        //then
        Assert.assertTrue(tomatoPlant.equals(cropRow.getCropById(0)));
    }

    @Test
    public void testMakeNoise() {
        //given
        String expected = "Howdy";
        //when
        Froilan froilan = Froilan.getInstance();
        String actual = froilan.makeNoise();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMount() {
        //given
        Horse horse = new Horse();
        Rideable expected = horse;
        //when
        Froilan froilan = Froilan.getInstance();
        froilan.mount(horse);
        Rideable actual = froilan.getIsRiding();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDismount() {
        //given
        Horse horse = new Horse();
        //when
        Froilan froilan = Froilan.getInstance();
        froilan.mount(horse);
        froilan.dismount(horse);
        //then
        Assert.assertNull(froilan.getIsRiding());
    }

    @Test
    public void testEat() {
        //given
        Froilan froilan = Froilan.getInstance();
        //when
        Tomato tomato = new Tomato();
        froilan.eat(tomato);
        froilan.getMealList();
        //then
        Assert.assertTrue(froilan.meals.contains(tomato));
    }

    @Test
    public void testInheritance() {
        Froilan froilan = Froilan.getInstance();
        Assert.assertTrue(froilan instanceof Farmer);
    }

    @Test
    public void testImplementationBotanist() {
        Froilan froilan = Froilan.getInstance();
        Assert.assertTrue(froilan instanceof Botanist);
    }

}

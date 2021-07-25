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
        Froilan froilan = new Froilan(expected);
        String actual = froilan.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        //given
        String expected = "Froiland";
        Froilan froilan = new Froilan(expected);
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
        Froilan farmer = new Froilan();
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
        Froilan froilan = new Froilan();
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
        Froilan froilan = new Froilan();
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
        Froilan froilan = new Froilan();
        froilan.mount(horse);
        froilan.dismount(horse);
        //then
        Assert.assertNull(froilan.getIsRiding());
    }

    @Test
    public void testEat() {
        //given
        Froilan froilan = new Froilan();
        //when
        Tomato tomato = new Tomato();
        froilan.eat(tomato);
        froilan.getMealList();
        //then
        Assert.assertTrue(froilan.meals.contains(tomato));
    }

    @Test
    public void testInheritance() {
        Froilan froilan = new Froilan();
        Assert.assertTrue(froilan instanceof Farmer);
    }

    @Test
    public void testImplementationBotanist() {
        Froilan froilan = new Froilan("Joe");
        Assert.assertTrue(froilan instanceof Botanist);
    }

}

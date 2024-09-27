package com.zipcodewilmington.froilansfarm.StructureTests;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Food.Carrot;
import com.zipcodewilmington.froilansfarm.Structure.Pantry;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PantryTest {
    @Test
    public void takeTest(){
        //given
        Pantry myPantry = new Pantry();
        //when
        //Carrot[] twoCarrots = myPantry.takeCarrot(2);
        Integer expected = 8;
        Integer actual = myPantry.countCarrots();
        //then
        Assert.assertEquals(expected,actual);

        //System.out.println(twoCarrots.length + " " + twoCarrots.getClass().getSimpleName());

    }

    @Test
    public void storeCarrotTest(){
        //given
        Pantry myPantry = new Pantry();
        Edible myCarrot = new Carrot();
        //when
        myPantry.storeCarrot(myCarrot);
        Integer actual = myPantry.countCarrots();
        Integer expected = 101;
        //then
        Assert.assertEquals(expected,actual);

    }
}

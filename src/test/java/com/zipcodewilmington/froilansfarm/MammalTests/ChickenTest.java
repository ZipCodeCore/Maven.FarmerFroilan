package com.zipcodewilmington.froilansfarm.MammalTests;


import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Food.Produce;
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
    public void testMakeNoise() {
        //given
        String expected = "Cluck Cluck";
        //when
        Chicken chicken = new Chicken();
        String actual = chicken.makeNoise();
        //then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testYield() {
        //given
        Chicken chicken = new Chicken();
        //when
        chicken.fertilize();
        Edible egg = chicken.yield();
        //then
        Assert.assertTrue(egg instanceof Egg);
    }

    @Test
    public void testEat() {
        //given
        Chicken chicken = new Chicken();
        //when
        EarCorn earCorn = new EarCorn();
        chicken.eat(earCorn);
        chicken.getMealList();
        //then
        Assert.assertTrue(chicken.meals.contains(earCorn));
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

    @Test
    public void testImplementationProduce() {
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Produce);
    }

}

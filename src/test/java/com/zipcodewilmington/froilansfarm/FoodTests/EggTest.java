package com.zipcodewilmington.froilansfarm.FoodTests;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class EggTest {

    @Test
    public void eggTest() {
        Edible egg = new Egg();
        Assert.assertTrue(egg instanceof Egg);
    }

    @Test
    public void testEggImplementation() {
        Egg egg = new Egg();
        Assert.assertTrue(egg instanceof Edible);
    }

    @Test
    public void isItFertilizedTest(){
        Egg egg = new Egg();
        Boolean fertilized = egg.isItFertilized();
        Assert.assertFalse(fertilized);
    }

    @Test
    public void setIsFertilizedTest(){
        Egg egg = new Egg();
        egg.setIsFertilized(true);
        Boolean fertilized = egg.isItFertilized();
        Assert.assertTrue(fertilized);
    }

}

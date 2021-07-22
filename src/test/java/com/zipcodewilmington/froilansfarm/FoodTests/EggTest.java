package com.zipcodewilmington.froilansfarm.FoodTests;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class EggTest {

    @Test
    public void eggTest() {
        Egg egg = new Egg();

    }

    @Test
    public void testEggImplementation() {
        Egg egg = new Egg();
        Assert.assertTrue(egg instanceof Edible);
    }
}

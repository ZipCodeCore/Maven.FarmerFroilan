package com.zipcodewilmington.froilansfarm.FoodTests;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {

    @Test
    public void tomatoTest() {
        Tomato tomato = new Tomato();
    }

    @Test
    public void testTomatoImplementation() {
        Tomato tomato = new Tomato();
        Assert.assertTrue(tomato instanceof Edible);
    }

}

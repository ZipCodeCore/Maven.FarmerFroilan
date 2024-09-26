package com.zipcodewilmington.froilansfarm.FoodTests;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Food.Carrot;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class CarrotTest {

    @Test
    public void carrotTest() {
        Carrot carrot = new Carrot();

    }

    @Test
    public void testEarCornImplementation() {
        Carrot carrot = new Carrot();
        Assert.assertTrue(carrot instanceof Edible);
    }
}

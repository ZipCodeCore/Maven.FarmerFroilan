package com.zipcodewilmington.froilansfarm.FoodTests;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import org.junit.Assert;
import org.junit.Test;

public class EarCornTest {

    @Test
    public void eggTest() {
        EarCorn earCorn = new EarCorn();

    }

    @Test
    public void testEarCornImplementation() {
        EarCorn earCorn = new EarCorn();
        Assert.assertTrue(earCorn instanceof Edible);
    }
}

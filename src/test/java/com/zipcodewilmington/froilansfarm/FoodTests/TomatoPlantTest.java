package com.zipcodewilmington.froilansfarm.FoodTests;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Food.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void yieldTest(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.fertilize();
        Edible food = tomatoPlant.yield();
        Assert.assertTrue(food instanceof Tomato);
    }

    @Test
    public void yieldNullTest(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        Edible food = tomatoPlant.yield();
        Assert.assertNull(food);
    }
}

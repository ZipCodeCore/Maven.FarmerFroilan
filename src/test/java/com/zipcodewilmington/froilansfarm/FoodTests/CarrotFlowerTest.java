package com.zipcodewilmington.froilansfarm.FoodTests;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Food.*;
import org.junit.Assert;
import org.junit.Test;

public class CarrotFlowerTest {

    @Test
    public void setHarvestedTest() {
        CarrotFlower carrotFlower = new CarrotFlower(2);
        carrotFlower.setHarvested(true);
        boolean actual = carrotFlower.checkHarvested();
        Assert.assertEquals(true, actual);

    }

    @Test
    public void checkHarvestedTest() {
        CarrotFlower carrotFlower = new CarrotFlower(2);
        boolean actual = carrotFlower.checkHarvested();
        Assert.assertEquals(false, actual);

    }

    @Test
    public void setFertilizedTest(){
        CarrotFlower carrotFlower = new CarrotFlower(2);
        carrotFlower.fertilize();
        Boolean stalkIsFertilized = carrotFlower.checkFertilized();
        Assert.assertTrue(stalkIsFertilized);
    }

    @Test
    public void checkFertilizedTest() {
        CarrotFlower carrotFlower = new CarrotFlower(2);
        Boolean stalkIsFertilized = carrotFlower.checkFertilized();
        Assert.assertFalse(stalkIsFertilized);

    }


    @Test
    public void testCornStalkInheritance() {
        CarrotFlower carrotFlower = new CarrotFlower(2);
        Assert.assertTrue(carrotFlower instanceof Crop);
    }

    @Test
    public void yieldTest(){
        CarrotFlower carrotFlower = new CarrotFlower();
        carrotFlower.fertilize();
        //when
        Edible harvest = carrotFlower.yield();
        Boolean harvested = carrotFlower.checkHarvested();
        //then
        Assert.assertTrue(harvest instanceof Carrot);
        Assert.assertTrue(harvested);
    }

    @Test
    public void yieldNullTest(){
        CarrotFlower carrotFlower = new CarrotFlower();
        //when
        Edible harvest = carrotFlower.yield();
        Boolean harvested = carrotFlower.checkHarvested();
        //then
        Assert.assertNull(harvest);
        Assert.assertFalse(harvested);
    }
}

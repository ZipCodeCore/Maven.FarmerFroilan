package com.zipcodewilmington.froilansfarm.FoodTests;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Food.CornStalk;
import com.zipcodewilmington.froilansfarm.Food.Crop;

import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test
    public void setHarvestedTest() {
        CornStalk cornStalk = new CornStalk(2);
        cornStalk.setHarvested(true);
        boolean actual = cornStalk.checkHarvested();
        Assert.assertEquals(true, actual);

    }

    @Test
    public void checkHarvestedTest() {
        CornStalk cornStalk = new CornStalk(2);
        boolean actual = cornStalk.checkHarvested();
        Assert.assertEquals(false, actual);

    }

    @Test
    public void setFertilizedTest(){
        CornStalk cornStalk = new CornStalk(2);
        cornStalk.fertilize();
        Boolean stalkIsFertilized = cornStalk.checkFertilized();
        Assert.assertTrue(stalkIsFertilized);
    }

    @Test
    public void checkFertilizedTest() {
        CornStalk cornStalk = new CornStalk(2);
        Boolean stalkIsFertilized = cornStalk.checkFertilized();
        Assert.assertFalse(stalkIsFertilized);

    }


    @Test
    public void testCornStalkInheritance() {
        CornStalk cornStalk = new CornStalk(2);
        Assert.assertTrue(cornStalk instanceof Crop);
    }

    @Test
    public void yieldTest(){
        CornStalk cornStalk = new CornStalk();
        cornStalk.fertilize();
        //when
        Edible harvest = cornStalk.yield();
        Boolean harvested = cornStalk.checkHarvested();
        //then
        Assert.assertTrue(harvest instanceof EarCorn);
        Assert.assertTrue(harvested);
    }

    @Test
    public void yieldNullTest(){
        CornStalk cornStalk = new CornStalk();
        //when
        Edible harvest = cornStalk.yield();
        Boolean harvested = cornStalk.checkHarvested();
        //then
        Assert.assertNull(harvest);
        Assert.assertFalse(harvested);
    }

}

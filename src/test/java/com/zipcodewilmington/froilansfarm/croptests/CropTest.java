package com.zipcodewilmington.froilansfarm.croptests;

import com.zipcodewilmington.froilansfarm.crops.*;
import org.junit.Assert;
import org.junit.Test;

public class CropTest {

    @Test
    public void nullaryConstructorTest(){
        //given
        Crop tomatoPlant = new TomatoPlant();

        //when
        int actual = tomatoPlant.getNumOfEdiblesYielded();

        //then
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void nullaryCornConstructorTest(){
        //given
        Crop cornPlant = new CornPlant();

        //when
        int actual = cornPlant.getNumOfEdiblesYielded();

        //then
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test (expected =  UnsupportedOperationException.class)
    public void countFertilizedFalseTest(){
        //given
        Crop tomatoPlant = new TomatoPlant();
        Tomato tomato = new Tomato();
        int expected = 0;

        //when
        tomatoPlant.yield(tomato);
        int actual = tomatoPlant.getNumOfEdiblesYielded();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test (expected =  UnsupportedOperationException.class)
    public void countHarvestFalseTest(){
        //given
        Crop cornPlant = new CornPlant();
        EarOfCorn corn  = new EarOfCorn();

        int expected = 0;

        //when
        cornPlant.yield(corn);
        int actual = cornPlant.getNumberofHarvest();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void AvailableToEatTest(){
        //given
        Crop tomatoPlant = new TomatoPlant();
        Tomato tomato = new Tomato();
        int expected = 0;

        //when
        tomatoPlant.yield(tomato);
        int actual = tomatoPlant.getFoodToEat();

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void countFertilizedTrueTest(){
        //given
        Crop tomatoPlant = new TomatoPlant();
        Tomato tomato = new Tomato();
        int expected = 1;

        //when
        tomatoPlant.fertilize();
        tomatoPlant.yield(tomato);
        int actual = tomatoPlant.getNumOfEdiblesYielded();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countHarvestPossibleTest(){
        //given
        Crop tomatoPlant = new TomatoPlant();
        Tomato tomato = new Tomato();
        int expected = 0;

        //when
        tomatoPlant.fertilize();
        tomatoPlant.yield(tomato);
        int actual = tomatoPlant.getNumberofHarvest();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public  void postHarvestTest(){
        //given
        Crop cornPlant = new CornPlant();
        EarOfCorn corn = new EarOfCorn();
        int expected = 1;

        //when
        cornPlant.fertilize();
        cornPlant.yield(corn);
        cornPlant.harvest();
        int actual = cornPlant.getNumberofHarvest();

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void AvailableToEatTrueTest(){
        //given
        Crop tomatoPlant = new TomatoPlant();
        Tomato tomato = new Tomato();
        int expected = 1;

        //when
        tomatoPlant.fertilize(); //sets fertilized equal to true
        tomatoPlant.yield(tomato); //preps for harvest
        tomatoPlant.harvest(); //makes food available to eat
        int actual = tomatoPlant.getFoodToEat();

        //then
        Assert.assertEquals(expected, actual);

    }
}

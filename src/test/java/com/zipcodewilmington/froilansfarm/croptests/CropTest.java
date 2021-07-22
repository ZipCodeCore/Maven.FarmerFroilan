package com.zipcodewilmington.froilansfarm.croptests;

import com.zipcodewilmington.froilansfarm.crops.CornPlant;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.Tomato;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
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

    @Test
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

    @Test
    public void countHarvestFalseTest(){
        //given
        Crop tomatoPlant = new TomatoPlant();
        Tomato tomato = new Tomato();
        tomatoPlant.yield(tomato);
        int expected = 0;

        //when
        int actual = tomatoPlant.getNumberofHarvest();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
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
}

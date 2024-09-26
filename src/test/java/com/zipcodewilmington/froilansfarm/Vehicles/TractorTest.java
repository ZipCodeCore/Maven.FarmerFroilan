package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.CropRow;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {

    @Test
    public void constructorTest() {
        //given
        int numOfHarvCrops = 93;
        int numOfFertCrops = 32;
        boolean toBeHarvested = true;
        //when
        Tractor crop = new Tractor(false, 0, 0);

        //then
        Assert.assertNotEquals(numOfHarvCrops, crop.getNumOfHarvCrop());
        Assert.assertNotEquals(numOfFertCrops, crop.getNumOfFertCrop());
        Assert.assertNotEquals(toBeHarvested, false);
    }

    @Test
    public void nullaryConstructorTest() {
        //given
        boolean expectedHarvested = true;
        int expectedNumOfHarvCrop = 895894;
        int expectedNumOfFertCrop = 4863826;

        //when
        Tractor crop = new Tractor(false, 0, 0);
        //then
        Assert.assertNotEquals(expectedNumOfHarvCrop, crop.getNumOfHarvCrop());
        Assert.assertNotEquals(expectedNumOfFertCrop, crop.getNumOfFertCrop());
        Assert.assertNotEquals(expectedHarvested, crop.isToBeHarvested());

    }

    @Test
    public void getCropsTest1() {
        int expected = 15;
        Tractor crop = new Tractor(false, 0, 0);
        crop.setNumOfFertCrop(expected);
        //when
        int actual = crop.getNumOfFertCrop();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void needsToBeFertilizedTest() {
        //given
        int cropNum = 20;
        int fertCrop = 4;
        boolean expected = true;
        CropRow cropRow = new CropRow();
        //when
        Tractor crop = new Tractor(false, cropNum, fertCrop);
        boolean actual = crop.needsToBeHarvested(cropRow);
        //then
        Assert.assertEquals(expected, actual);


    }
}

package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {
    @Test
    public void constructorTest(){
        //given
        int numOfCropRows=93;
        int numOfFertCrops=32;
        boolean toBeFertilized=true;
        //when
        CropDuster crop = new CropDuster(false, 0, 0);

        //then
        Assert.assertNotEquals(numOfCropRows, crop.getNumOfCropRows());
        Assert.assertNotEquals(numOfFertCrops, crop.getNumOfFertCrop());
        Assert.assertNotEquals(toBeFertilized, false);
    }
    @Test
    public void nullaryConstructorTest(){
        //given
        boolean expectedFertilizer=false;
        int expectedNumOfCrop=895894;
        int expectedNumOfFertCrop=4863826;

        //when
        CropDuster crop = new CropDuster(true, 0, 0);
        //then
        Assert.assertNotEquals(expectedNumOfCrop, crop.getNumOfCropRows());
        Assert.assertNotEquals(expectedNumOfFertCrop, crop.getNumOfFertCrop());
        Assert.assertNotEquals(expectedFertilizer, crop.isToBeFertilized());

    }
    @Test
    public void getCropsTest1(){
        int expected= 15;
        CropDuster crop = new CropDuster(false,0, 0);
        crop.setNumOfCropRows(expected);
        //when
        int actual = crop.getNumOfCropRows();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void needsToBeFertilizedTest(){
        //given
        int cropNum=20;
        int fertCrop=4;
        boolean expected=true;
        //when
        CropDuster crop =new CropDuster(false, cropNum, fertCrop);
        boolean actual= crop.needsToBeFertilized(cropNum, fertCrop);
        //then
        Assert.assertEquals(expected, actual );
    }

    @Test
    public void getFertCropsTest1(){
        int expectedFertCrop = 5;
        CropDuster crop = new CropDuster(false, 0, 0);
        crop.setNumOfFertCrop(expectedFertCrop);

        int actual = crop.getNumOfFertCrop();

        Assert.assertEquals(expectedFertCrop, actual);
    }


}

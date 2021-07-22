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
        boolean toBeFertilized=false;
        //when
        CropDuster crop = new CropDuster(numOfCropRows, numOfFertCrops);

        //then
        Assert.assertEquals(numOfCropRows, crop.getNumOfCropRows());
        Assert.assertEquals(numOfFertCrops, crop.getNumOfFertCrop());
        Assert.assertEquals(toBeFertilized, false);
    }
    @Test
    public void nullaryConstructorTest(){
        //given
        boolean expectedFertilizer=false;
        int expectedNumOfCrop=895894;
        int expectedNumOfFertCrop=4863826;

        //when
        CropDuster crop = new CropDuster();
        //then
        Assert.assertEquals(expectedNumOfCrop, crop.getNumOfCropRows());
        Assert.assertEquals(expectedNumOfFertCrop, crop.getNumOfFertCrop());
        Assert.assertEquals(expectedFertilizer, crop.needsToBeFertilized(expectedNumOfCrop, expectedNumOfFertCrop));

    }
    @Test
    public void getCropsTest1(){
        int expected= 15;
        CropDuster crop = new CropDuster();
        crop.setNumOfCropRows();
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
        CropDuster crop =new CropDuster(cropNum, fertCrop);
        boolean actual= crop.needsToBeFertilized(cropNum, fertCrop);
        //then
        Assert.assertEquals(expected, actual );
    }

    @Test
    public void getFertCropsTest1(){}
    @Test
    public void getFertCropTest2(){}

}

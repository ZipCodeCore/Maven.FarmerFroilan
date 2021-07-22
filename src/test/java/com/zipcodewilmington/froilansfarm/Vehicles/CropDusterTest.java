package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Vehilce.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {
    @Test
    public void constructorTest(){
        //given


        //when

        //then
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
        Assert.assertFalse(expectedFertilizer, crop.hasFertilizer());
        Assert.assertFalse(expectedNumOfFertCrop, crop.getNumOfFertCrop());
        Assert.assertFalse(expectedNumOfCrop, crop.getNumOfCropRows());
    }
    @Test
    public void constructorTest2(){
        //given
        //when
        //then
    }
}

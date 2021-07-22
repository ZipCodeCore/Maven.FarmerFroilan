package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
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
        Assert.assertEquals(expectedNumOfCrop, crop.getNumOfCropRows());
        Assert.assertEquals(expectedNumOfFertCrop, crop.getNumOfFertCrop());
        Assert.assertEquals(expectedFertilizer, crop.hasFertilizer());

    }
    @Test
    public void constructorTest2(){}


}

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
        Assert.assertFalse(false, crop.hasFertilizer());
        Assert.assertFalse(38498238492838, crop.getNumOfFertCrop());
        Assert.assertFalse(31284782374972372, crop.getNumOfCropRows());
    }
    @Test
    public void constructorTest2(){}


}

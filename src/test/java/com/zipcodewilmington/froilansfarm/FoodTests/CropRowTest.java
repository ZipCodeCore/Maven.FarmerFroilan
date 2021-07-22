package com.zipcodewilmington.froilansfarm.FoodTests;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Food.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CropRowTest {

    @Test
    public void cropRowConstructorTest(){
        //given
        CropRow myCropRow = new CropRow();
        Integer exp = 0;
        Integer act = myCropRow.getNumberOfCrops();
        //then
        Assert.assertEquals(exp,act);
    }

    @Test
    public void plantCropTest() {
        //given
        CropRow myCropRow = new CropRow();
        Crop tomatoPlant = new TomatoPlant();
        //when
        myCropRow.plantCrop(tomatoPlant);
        Integer exp = 1;
        Integer act = myCropRow.getNumberOfCrops();
        //then
        Assert.assertEquals(exp,act);
    }

    @Test
    public void getCropByIdTest(){
        //given
        CropRow myCropRow = new CropRow();
        Crop tomato1 = new TomatoPlant(1);
        Crop corn = new CornStalk(2);
        Crop tomato2 = new TomatoPlant(3);
        //when
        myCropRow.plantCrop(corn);
        myCropRow.plantCrop(tomato1);
        myCropRow.plantCrop(tomato2);
        Crop retrieved = myCropRow.getCropById(3);
        //then
        Assert.assertEquals(tomato2,retrieved);
    }

    @Test
    public void fertilizeRowTest(){
        //given
        CropRow myCropRow = new CropRow();
        Crop tomato1 = new TomatoPlant(1);
        Crop corn = new CornStalk(2);
        Crop tomato2 = new TomatoPlant(3);
        myCropRow.plantCrop(corn);
        myCropRow.plantCrop(tomato1);
        myCropRow.plantCrop(tomato2);
        //when
        myCropRow.fertilizeRow();
        Boolean cornIsFertilized = corn.checkFertilized();
        Boolean tomato1IsFertilized = tomato1.checkFertilized();
        //then
        Assert.assertTrue(cornIsFertilized);
        Assert.assertTrue(tomato1IsFertilized);

    }

    @Test
    public void harvestRowTest(){
        //given
        CropRow myCropRow = new CropRow();
        Crop tomato1 = new TomatoPlant(1);
        Crop corn = new CornStalk(2);
        Crop tomato2 = new TomatoPlant(3);
        myCropRow.plantCrop(corn);
        myCropRow.plantCrop(tomato1);
        myCropRow.plantCrop(tomato2);
        myCropRow.fertilizeRow();
        //when
        ArrayList<Edible> basket = myCropRow.harvestRow();
        for(Edible item: basket){
            System.out.println(item.getClass().getSimpleName());
        }
        //then

    }


}

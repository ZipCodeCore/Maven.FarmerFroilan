package com.zipcodewilmington.froilansfarm.croptests;

import com.zipcodewilmington.froilansfarm.crops.CropRow;
import com.zipcodewilmington.froilansfarm.crops.Tomato;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class CropRowTest {
    @Test
    public void defaultConstructorTest(){
        //given
        CropRow testRow = new CropRow();

        //when
        int actual = testRow.getNumberofCropsPlanted();

        //then
        int expected = 0;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void defaultConstructorTest2(){
        //given
        CropRow testRow = new CropRow();

        //when
        int actual = testRow.getNumberofCropsPlanted();

        //then
        int expected = 0;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addCropTest(){
        //given
        CropRow testRow = new CropRow();
        TomatoPlant tomato = new TomatoPlant(0);

        //when
        testRow.addCrop(tomato, 2);
        int actual = testRow.getNumberofCropsPlanted();

        //then
        int expected = 2;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeCrop(){
        //given
        CropRow testRow = new CropRow();
        TomatoPlant tomato = new TomatoPlant(0);

        //when
        testRow.addCrop(tomato);
        testRow.removeCrop(tomato);
        int actual = testRow.getNumberofCropsPlanted();

        //then
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }


}

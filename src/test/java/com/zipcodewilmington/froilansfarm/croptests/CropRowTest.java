package com.zipcodewilmington.froilansfarm.croptests;

import com.zipcodewilmington.froilansfarm.crops.CropRow;
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
        int actual = testRow.getCropRowSize();

        //then
        int expected = 0;
        Assert.assertEquals(expected, actual);

    }

}

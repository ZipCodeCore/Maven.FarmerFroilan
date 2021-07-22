package com.zipcodewilmington.froilansfarm.FoodTests;

import com.zipcodewilmington.froilansfarm.Food.CornStalk;
import com.zipcodewilmington.froilansfarm.Food.Crop;
import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Food.Produce;
import org.junit.Assert;
import org.junit.Test;

public class CropRowTest {

    @Test
    public void cropRowConstructorTest(){
        //given
        CropRow myCropRow = new CropRow();
        //then
        Assert.assertTrue(myCropRow instanceof Produce);
    }


    @Test
    public void yieldTest() {
        //given
        CropRow myCropRow = new CropRow();

        //when
    }

}

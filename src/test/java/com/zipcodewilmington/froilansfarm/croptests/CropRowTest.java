package com.zipcodewilmington.froilansfarm.croptests;

import com.zipcodewilmington.froilansfarm.crops.*;
import org.junit.Assert;
import org.junit.Test;

public class CropRowTest {
    @Test
    public void defaultConstructorTest(){
        //given
        CropRow testRow = new CropRow();

        //when
        int actual = testRow.getSize();

        //then
        int expected = 0;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void defaultConstructorTest2(){
        //given
        CropRow testRow = new CropRow();

        //when
        int actual = testRow.getSize();

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
        int actual = testRow.getSize();

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
        testRow.add(tomato);
        testRow.remove(tomato);
        int actual = testRow.getSize();

        //then
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void getTotalPlantsNegative(){
        //given
        Crop tomatoPlant = new TomatoPlant();
        Crop cornPlant = new CornPlant();
        tomatoPlant.yield(new Tomato());
        tomatoPlant.yield(new Tomato());
        cornPlant.yield(new EarOfCorn());

        //when
        CropRow testRow = new CropRow();
        testRow.add(tomatoPlant);
        testRow.add(cornPlant);
        int actual = testRow.getSize();

        //then
        Assert.assertEquals(2, actual);

    }

    @Test
    public void getTotalPlantsPositive() {
        //given
        Crop tomatoPlant = new TomatoPlant();
        Crop cornPlant = new CornPlant();
        CropRow testRow = new CropRow();

        //when
        int before = testRow.getSize();
        Assert.assertEquals(0, before);
        testRow.add(tomatoPlant);
        testRow.add(cornPlant);
        int actual = testRow.getSize();

        //then
        Assert.assertEquals(2, actual);
    }

    @Test
    public void getTotalEdibles(){
        //given
        Crop tomatoPlant = new TomatoPlant();
        Crop cornPlant = new CornPlant();
        CropRow testRow = new CropRow();
        testRow.add(tomatoPlant);
        testRow.add(cornPlant);
        tomatoPlant.fertilize();
        cornPlant.fertilize();

        int expected = 3;

        //when
        tomatoPlant.yield(new Tomato());
        tomatoPlant.yield(new Tomato());
        cornPlant.yield(new EarOfCorn());
        int actual = testRow.getNumberOfEdibles();

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test (expected = UnsupportedOperationException.class)
    public void getTotalEdiblesExceptionTest() {
        //given
        Crop tomatoPlant = new TomatoPlant();
        Crop cornPlant = new CornPlant();
        tomatoPlant.yield(new Tomato());
        tomatoPlant.yield(new Tomato());
        cornPlant.yield(new EarOfCorn());
        int expected = 3;

        //when
        CropRow testRow = new CropRow();
        testRow.add(tomatoPlant);
        testRow.add(cornPlant);
        tomatoPlant.fertilize();
        cornPlant.fertilize();
        int actual = testRow.getNumberOfEdibles();

        //then
        Assert.assertEquals(expected, actual);
    }
}

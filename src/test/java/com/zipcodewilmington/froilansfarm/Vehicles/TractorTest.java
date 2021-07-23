package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Food.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {

    @Test
    public void constructorTest1(){
        Vehicle tractor = new Tractor();

        Boolean instance = tractor instanceof Vehicle;

        Assert.assertTrue(instance);
    }

    @Test
    public void constructorTest2(){
        Vehicle tractor = new Tractor();

        Boolean instance = tractor instanceof FarmVehicle;

        Assert.assertTrue(instance);
    }

    @Test
    public void constructorMakeNoise(){
        Vehicle tractor = new Tractor();

        String actual = tractor.makeNoise();
        String expected = "Chuggumgumgumgumgum";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tractorHarvestTest(){
        Tractor tractor = new Tractor();

        Farm farm = new Farm();
        CropRow row = new CropRow();
        row.plantCrop(new TomatoPlant());
        farm.getField().add(row);
        tractor.operate(farm);

        Integer actual = tractor.getaList().size();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);
    }

}

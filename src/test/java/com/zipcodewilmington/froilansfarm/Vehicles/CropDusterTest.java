package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Food.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Mammal.Froilanda;
import com.zipcodewilmington.froilansfarm.Rider;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {

    @Test
    public void constructorTest1(){
        CropDuster duster = new CropDuster();

        Boolean actual = duster instanceof Vehicle;

        Assert.assertTrue(actual);
    }

    @Test
    public void constructorTest2(){
        CropDuster duster = new CropDuster();

        Boolean actual = duster instanceof FarmVehicle;

        Assert.assertTrue(actual);
    }

    @Test
    public void constructorTest3(){
        CropDuster duster = new CropDuster();

        Boolean actual = duster instanceof Aircraft;

        Assert.assertTrue(actual);
    }

    @Test
    public void fertilizeTest(){
        CropDuster duster = new CropDuster();
        Farm farm = new Farm();
        TomatoPlant plant = new TomatoPlant();
        CropRow row = new CropRow();
        row.plantCrop(plant);
        farm.getField().add(row);
        duster.operate(farm);

        Boolean actual = plant.checkFertilized();

        Assert.assertTrue(actual);
    }

    @Test
    public void shootTest(){
        Aircraft duster = new CropDuster();

        String actual = duster.shoot();
        String expected = "BULLETS";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rideTest(){
       CropDuster duster = new CropDuster();

       Farm farm = new Farm();

        Froilanda froilanda = Froilanda.getInstance();
        froilanda.mount(duster);

        duster.ride(froilanda);

        Boolean actual = duster.getPilot() != null;

        Assert.assertTrue(actual);
    }

}

package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class FarmVehicleTest {

    @Test
    public void nullaryConstructorTest(){
        //given
        String expected= "";
        FarmVehicle farm = new FarmVehicle();
        farm.setLocation(expected);
        //when
        String actual= farm.getLocation();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void inheritenceCropDustTest(){
        FarmVehicle car = new FarmVehicle();
        Assert.assertTrue(car instanceof Vehicle);
    }
    @Test
    public void inheritenceCropDustTest(){
        FarmVehicle car = new FarmVehicle();
        Assert.assertTrue(car instanceof Vehicle);
    }
}

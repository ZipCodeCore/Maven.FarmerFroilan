package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;
import com.zipcodewilmington.froilansfarm.storage.Farm;
import org.junit.Assert;
import org.junit.Test;

public class FarmVehicleTest {

    @Test
    public void nullaryConstructorTest(){
        //given
        String expected = null;
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
    public void inheritenceCropDustTest1(){
        FarmVehicle car = new FarmVehicle();
        Assert.assertTrue(car instanceof Rideable);
    }

    @Test
    public void getLocationTest () {
        FarmVehicle thing = new FarmVehicle();
        String expected = "Over here";

        thing.setLocation("Over here");
        String actual = thing.getLocation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void noiseMakerTest () {
        FarmVehicle thing = new FarmVehicle();
        String expected = null;

        String actual = thing.noiseMaker();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hasBeenRiden () {
        FarmVehicle thing = new FarmVehicle();
        Boolean expected = false;

        Boolean actual = thing.hasBeenRiden();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void operationOnFarmTest () {
        FarmVehicle thing = new FarmVehicle();
        Boolean expected = true;
        thing.setOnFarm("Is on farm?");

        Boolean actual = thing.operation(thing.getOnFarm());

        Assert.assertEquals(expected, actual);
    }

    @Test (expected = AssertionError.class)
    public void operationOffFarmTest () {
        FarmVehicle thing = new FarmVehicle();
        Boolean expected = true;
        thing.setOnFarm("Is on farm?");
        thing.setLocation("Not on the farm");

        Boolean actual = thing.operation(thing.getLocation());

        Assert.assertEquals(expected, actual);
    }
}

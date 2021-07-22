package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicle;
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
    public void operateTest(){


    }

}

package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Mammal.Farmer;
import com.zipcodewilmington.froilansfarm.Mammal.Froilan;
import com.zipcodewilmington.froilansfarm.Mammal.Froilanda;
import com.zipcodewilmington.froilansfarm.Pilot;
import com.zipcodewilmington.froilansfarm.Rider;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class AircraftTest {

    @Test
    public void constructor(){
        Vehicle aircraft = new CropDuster<>();

        Boolean actual = aircraft instanceof Vehicle;

        Assert.assertTrue(actual);
    }

    @Test
    public void aircraftTest(){
        Vehicle aircraft = new CropDuster<>();

        String actual = aircraft.makeNoise();
        String expected = "Bzzzzeewwwwwwwwwww Rat-tat-tat-tat-tat";

        Assert.assertEquals(expected, actual);
    }

    
}

package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import com.zipcodewilmington.froilansfarm.Mammal.Horse;
import com.zipcodewilmington.froilansfarm.Mammal.Person;
import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Structure.FarmHouse;
import com.zipcodewilmington.froilansfarm.Structure.Stable;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FarmTest {

    @Test
    public void farmConstructorTest() {
       Farm farm = new Farm();

       boolean actualFarm = farm.getFarmhouse() != null;
       boolean actualCoops = farm.getChickenCoops() != null;
       boolean actualDuster = farm.getCropDuster() != null;
        boolean actualStables = farm.getStables() != null;
        boolean actualTractor = farm.getTractor() != null;
        boolean actualField = farm.getField() != null;
        boolean actualJohnDeer = farm.getJohnDeer() != null;


        Assert.assertTrue(actualFarm);
        Assert.assertTrue(actualCoops);
        Assert.assertTrue(actualDuster);
        Assert.assertTrue(actualStables);
        Assert.assertTrue(actualTractor);
        Assert.assertTrue(actualField);
        Assert.assertTrue(actualJohnDeer);

    }
}

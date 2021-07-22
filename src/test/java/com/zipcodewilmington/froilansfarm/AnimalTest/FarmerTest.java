package com.zipcodewilmington.froilansfarm.AnimalTest;

import com.zipcodewilmington.froilansfarm.Animal.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {
    @Test
    public void constructorTest(){
        Farmer farmer= new Farmer();
        String actualName="Froilan";
        Assert.assertEquals(farmer.getName(),actualName);
    }
    @Test
    public void hasEatenTest(){
        Farmer farmer= new Farmer();
        Boolean actual=false;
        Assert.assertFalse(farmer.hasEaten());
    }
}

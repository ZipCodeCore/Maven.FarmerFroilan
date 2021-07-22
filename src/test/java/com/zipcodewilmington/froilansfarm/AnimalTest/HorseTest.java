package com.zipcodewilmington.froilansfarm.AnimalTest;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {
    @Test
    public void makeNoiseTest() {
        Horse horse= new Horse(null,null,null);
        String noise = "Neigh!";
        String actual = horse.makeNoise();
        Assert.assertEquals("Neigh!", actual);
    }

    @Test
    public void hadBeenRiddenTest(){
        Horse horse =new Horse(null,null,null);
                Boolean actual=false;
        Assert.assertEquals(horse.hasBeenRiden(),actual);
    }

    @Test
    public void constructorTest(){
        Horse horse= new Horse("robert",10,null);
        String actual="robert";
        Assert.assertEquals(horse.getName(),actual);
    }
}

package com.zipcodewilmington.froilansfarm.AnimalTest;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Produce;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void instanceOfAnimal () {
        Chicken chicken = new Chicken();

        Assert.assertTrue(chicken instanceof Animal);
    }

    @Test
    public void instanceOfProduce () {
        Chicken chicken = new Chicken();

        Assert.assertTrue(chicken instanceof Produce);
    }

    @Test
    public void hasBeenFertilisedTest(){
        Chicken chicken =new Chicken();
        Assert.assertFalse(chicken.hasBeenFertilized());
    }
    @Test
    public void hasBeenHarvestedTest(){
        Chicken chicken =new Chicken();
        Assert.assertFalse(chicken.hasBeenHarvested());
    }

    @Test
    public void yieldTest(){
        Chicken chicken =new Chicken();
        Edible object = new Edible() {
            @Override
            public boolean isEaten() {
                return false;
            }
        };
        chicken.yield(object);
        Assert.assertTrue(true);
    }

    @Test
    public void makeNoiseTest(){
        Chicken chicken = new Chicken();
        String noise="Cluck!";
        String actual= chicken.makeNoise();
        Assert.assertEquals("Cluck!",actual);
    }

}

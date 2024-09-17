package com.zipcodewilmington.froilansfarm.edible;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zipcodewilmington.froilansfarm.crops.Egg;
import org.junit.Assert;
import org.junit.Test;

public class EggTest {

    @Test
    public void EggIsEdibleTest(){
        Egg edibleEgg = new Egg();

        Boolean expected = true;
        Boolean actual = edibleEgg.IsEdible();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hasBeenFertilizedTest() {
        // Given
        //Egg fertilizedEgg = new Egg();

        // When
        //boolean setEgg = fertilizedEgg.IsEdible();

        // Then
        //Assert.assertTrue(setEgg);
    }
}

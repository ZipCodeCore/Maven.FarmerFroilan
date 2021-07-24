package com.zipcodewilmington.froilansfarm.edible;

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
}

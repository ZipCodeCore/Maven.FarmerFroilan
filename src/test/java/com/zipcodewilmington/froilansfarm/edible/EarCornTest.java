package com.zipcodewilmington.froilansfarm.edible;

import com.zipcodewilmington.froilansfarm.crops.EarCorn;
import org.junit.Assert;
import org.junit.Test;


public class EarCornTest {

    @Test
    public void earCornIsEdibleTest() {
        EarCorn edibleEarCorn = new EarCorn();

        boolean expected = true;
        boolean actual =  edibleEarCorn.IsEdible();

        Assert.assertEquals(expected, actual);
    }

}

package com.zipcodewilmington.froilansfarm.edible;

import com.zipcodewilmington.froilansfarm.crops.EarCorn;
import com.zipcodewilmington.froilansfarm.crops.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {
    @Test
    public void TomatoIsEdibleTest() {
        Tomato edibleTomato = new Tomato();

        boolean expected = true;
        boolean actual =  edibleTomato.IsEdible();

        Assert.assertEquals(expected, actual);
    }
}

package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.crops.Potato;
import org.junit.Assert;
import org.junit.Test;

public class PotatoTest {

    @Test
    public void PotatoIsEdibleTest() {
        Potato ediblePotato = new Potato();

        Boolean expected =  true;
        Boolean actual = ediblePotato.IsEdible();

        Assert.assertEquals(expected, actual);
    }

}

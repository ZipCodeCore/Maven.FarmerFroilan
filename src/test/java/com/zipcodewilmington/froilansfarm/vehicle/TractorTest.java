package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.Tomato;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TractorTest {




    @Test
    void harvest() {
        Tractor t = new Tractor();

        boolean expected = true;
        boolean actual = t.harvest();

        Assert.assertEquals(expected,actual);

    }
}
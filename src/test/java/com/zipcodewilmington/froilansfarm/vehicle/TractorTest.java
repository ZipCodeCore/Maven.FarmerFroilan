package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TractorTest {


    @Test
    void harvest() {
        Tractor t = new Tractor(4);

        boolean expected = true;
        boolean actual = t.harvest(4);

        Assert.assertEquals(expected,actual);

    }
}
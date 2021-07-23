package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.CropRow;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CropDusterTest {

    @Test
    void fertilize() {
        CropDuster cropDus = new CropDuster();

        boolean expected = true;
        boolean actual = cropDus.fertilize(CropRow);

        Assert.assertEquals(expected,actual);


    }

    @Test
    void operate() {
    }
}
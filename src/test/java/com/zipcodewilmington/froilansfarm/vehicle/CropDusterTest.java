package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Tomato;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CropDusterTest {

    @Test
    void fertilize() {
        CropDuster cropDus = new CropDuster();

        boolean expected = true;
        cropDus.fertilize(new CropRow(new TomatoPlant(true, true)));

        Assert.assertTrue(expected);


    }

    @Test
    void operate() {
    }
}
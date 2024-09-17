package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crops.EarCorn;
import com.zipcodewilmington.froilansfarm.crops.Potato;
import com.zipcodewilmington.froilansfarm.crops.Tomato;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CropRowTest {

    @Test
    public void constructorTest() {
        // Given
        TomatoPlant tomato = new TomatoPlant(true, true);
        CropRow cropRow = new CropRow(tomato);
        Integer expectedNumberOfCrops = 15;

        // When
        Integer actualNumberOfCrops = cropRow.getNumberOfCropsInRow();

        // Then
        Assert.assertEquals(expectedNumberOfCrops, actualNumberOfCrops);
    }
}

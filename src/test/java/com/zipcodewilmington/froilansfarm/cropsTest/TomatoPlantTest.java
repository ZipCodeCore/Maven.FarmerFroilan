package com.zipcodewilmington.froilansfarm.cropsTest;

import com.zipcodewilmington.froilansfarm.crops.Tomato;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void testGetEdible() {

        // Given
        TomatoPlant tomatoPlant = new TomatoPlant(true, true);

        // When
        Tomato tomato = tomatoPlant.getEdible(new Tomato());

        // Then
        Assert.assertNotNull(tomato);

    }
}

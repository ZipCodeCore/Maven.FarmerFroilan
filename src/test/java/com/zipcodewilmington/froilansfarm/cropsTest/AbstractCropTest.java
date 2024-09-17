package com.zipcodewilmington.froilansfarm.cropsTest;

import com.zipcodewilmington.froilansfarm.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.EarCorn;
import com.zipcodewilmington.froilansfarm.crops.Edible;
import org.junit.Assert;
import org.junit.Test;

public class AbstractCropTest {
    @Test
    public <someType extends Edible> void testGetEdible() {

        // Given
        CornStalk cornStalk = new CornStalk(true, true);

        // When
        EarCorn earCorn = cornStalk.getEdible(new EarCorn());

        // Then
        Assert.assertNotNull(earCorn);
    }

}

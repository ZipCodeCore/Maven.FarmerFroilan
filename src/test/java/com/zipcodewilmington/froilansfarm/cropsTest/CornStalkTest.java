package com.zipcodewilmington.froilansfarm.cropsTest;

import com.zipcodewilmington.froilansfarm.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.crops.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test
    public void testGetEdible() {

        // Given
        CornStalk cornStalk = new CornStalk(true, true);

        // When
        EarCorn earCorn = cornStalk.getEdible(new EarCorn());

        // Then
        Assert.assertNotNull(earCorn);

    }

}

package com.zipcodewilmington.froilansfarm.cropsTest;

import com.zipcodewilmington.froilansfarm.crops.Potato;
import com.zipcodewilmington.froilansfarm.crops.PotatoRoot;
import org.junit.Assert;
import org.junit.Test;

public class PotatoRootTest {

    @Test
    public void testGetEdible() {

        // Given
        PotatoRoot potatoRoot = new PotatoRoot(true, true);

        // When
        Potato potato = potatoRoot.getEdible(new Potato());

        // Then
        Assert.assertNotNull(potato);

    }
}

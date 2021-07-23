package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ChickenTest {
    Chicken chicken = new Chicken();

    @Test
    public void testMakeNoise() {
        String expected = "cluck!";
        String actual = chicken.makeNoise();
        Assertions.assertEquals(expected, actual);
    }

}

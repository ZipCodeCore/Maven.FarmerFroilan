package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {

    Horse horse = new Horse();

    @Test
    void testMakeNoise() {
        String expected = "neigh!";
        String actual = horse.makeNoise();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void move() {
    }

    @Test
    void eat() {
    }
}
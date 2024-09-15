package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.food.Corn;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HorseTest {

    @Test
    void printsCorrectStringWhenHorseEats() {
        //TODO

        // GIVEN
        Horse horse = new Horse();

        // WHEN

        String consume = horse.eat(new Corn());

        // THEN
        assertEquals("munch munch", consume);
    }

    @Test
    void printsCorrectStringWhenHorseMakesNoise() {
        //TODO

        // GIVEN
        Horse horse = new Horse();

        // WHEN
        String noise = horse.makeNoise();

        // THEN
        assertEquals("neigh", noise);
    }

}

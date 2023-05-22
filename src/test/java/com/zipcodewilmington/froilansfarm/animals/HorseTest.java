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
<<<<<<< HEAD
        String consume = horse.eat(new EdibleEgg());
=======
        horse.eat(new Corn());
>>>>>>> accf6c3e7998137e63d9ace02d2cb88ba86e3c90

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

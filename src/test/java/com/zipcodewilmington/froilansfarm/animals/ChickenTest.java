package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.food.Corn;
import com.zipcodewilmington.froilansfarm.food.EdibleEgg;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChickenTest {

    @Test
    void isChickenFertilized(){
        //TODO

        // GIVEN
        Chicken chicken = new Chicken();
        // WHEN
        boolean isFertilized = chicken.hasBeenFertilized;
        // THEN
        assertEquals(false, isFertilized);
    }

    @Test
    void isYielded(){
        //TODO

        // GIVEN
        Chicken chicken = new Chicken();
        EdibleEgg egg1 = new EdibleEgg();
        // WHEN
        Edible e = chicken.yield();
        // THEN
        assertEquals(false, e);
    }


    @Test
    void printsCorrectStringWhenChickenEats() {
        //TODO

        // GIVEN
        Chicken chicken = new Chicken();

        // WHEN
        String consume = chicken.eat(new Corn());

        // THEN
        assertEquals("peck peck", consume);
    }

    @Test
    void printsCorrectStringWhenChickenMakesNoise() {
        //TODO

        // GIVEN
        Chicken chicken = new Chicken();

        // WHEN
        String noise = chicken.makeNoise();

        // THEN
        assertEquals("buck buck buckawk", noise);

    }
}

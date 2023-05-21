package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.food.Corn;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.plants.Crop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChickenTest {

    @Test
    void isChickenFertilized(){
        //TODO

        // GIVEN
        Chicken chicken = new Chicken();
        // WHEN
        boolean isFertilized = chicken.hasBeenFertilized;
        // THEN
        assertEquals(true, isFertilized);
    }

    @Test
    void isYielded(){
        //TODO

        // GIVEN
        Chicken chicken = new Chicken();
        // WHEN
        Edible e = chicken.yield();
        // THEN
        assertEquals(true, e);
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

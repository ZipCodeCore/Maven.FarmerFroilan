package com.zipcodewilmington.froilansfarm.days;

import com.zipcodewilmington.froilansfarm.Farmer;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.buildings.Stable;
import com.zipcodewilmington.froilansfarm.food.Corn;
import com.zipcodewilmington.froilansfarm.food.EdibleEgg;
import com.zipcodewilmington.froilansfarm.food.Tomato;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EveryMorningTest {

    @Test
    void everyMorning() {
<<<<<<< HEAD
        // TODO
        // GIVEN
=======
        //GIVEN
>>>>>>> accf6c3e7998137e63d9ace02d2cb88ba86e3c90
        Farmer farmer = new Farmer("Froilan");
        Farmer farmer2 = new Farmer("Froilanda");

        Horse horse1 = new Horse();
        Horse horse2 = new Horse();

        Stable stable1 = new Stable();
        Stable stable2 = new Stable();

        Corn corn1 = new Corn();
        Corn corn2 = new Corn();
        Corn corn3 = new Corn();
        Corn corn4 = new Corn();
        Corn corn5 = new Corn();
        Corn corn6 = new Corn();
        Corn corn7 = new Corn();
        Corn corn8 = new Corn();
        Corn corn9 = new Corn();

        Tomato tomato1 = new Tomato();
        Tomato tomato2 = new Tomato();
        Tomato tomato3 = new Tomato();

        EdibleEgg egg1 = new EdibleEgg();
        EdibleEgg egg2 = new EdibleEgg();
        EdibleEgg egg3 = new EdibleEgg();
        EdibleEgg egg4 = new EdibleEgg();
        EdibleEgg egg5 = new EdibleEgg();
        EdibleEgg egg6 = new EdibleEgg();
        EdibleEgg egg7 = new EdibleEgg();

        boolean inStable1 = stable1.addHorse(horse1);
        boolean inStable2 = stable2.addHorse(horse2);
        assertTrue(inStable1);
        assertTrue(inStable2);

        // WHEN
        farmer.mount(horse1);
        farmer2.mount(horse2);

        farmer.feedHorse(horse1, corn1);
        farmer.feedHorse(horse2, corn2);
        farmer.feedHorse(horse1, corn3);
        farmer.feedHorse(horse2, corn4);
        farmer.feedHorse(horse1, corn5);
        farmer.feedHorse(horse2, corn6);

        farmer.eat(corn1);
        farmer.eat(tomato1);
        farmer.eat(tomato2);
        farmer.eat(egg1);
        farmer.eat(egg2);
        farmer.eat(egg3);
        farmer.eat(egg4);
        farmer.eat(egg5);

        farmer2.eat(corn2);
        farmer2.eat(corn3);
        farmer2.eat(tomato3);
        farmer2.eat(egg6);
        farmer2.eat(egg7);

        // THEN
        assertEquals(1, farmer.getCornCount());
        assertEquals(2, farmer.getTomatoCount());
        assertEquals(5, farmer.getEggCount());
        assertEquals(2, farmer2.getCornCount());
        assertEquals(1, farmer2.getTomatoCount());
        assertEquals(2, farmer2.getEggCount());
    }
}
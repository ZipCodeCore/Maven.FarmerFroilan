package com.zipcodewilmington.froilansfarm.animal.person;

import com.zipcodewilmington.froilansfarm.animals.person.Botanist;
import com.zipcodewilmington.froilansfarm.animals.person.Farmer;
import com.zipcodewilmington.froilansfarm.animals.person.Person;
import com.zipcodewilmington.froilansfarm.animals.person.Rider;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class FarmerTest {
    private Farmer farmer = new Farmer();

    @BeforeEach
    void setUp() {
        this.farmer = new Farmer();
    }

    @Test
    public void testInstanceOf(){

        Assertions.assertTrue(farmer instanceof Person);
        Assertions.assertTrue(farmer instanceof Rider);
        Assertions.assertTrue(farmer instanceof Botanist);
    }

    @Test
    public void testMakeNoise(){
        //given
        String expected = "YeeHaw!";

        //When
        String actual = farmer.makeNoise();

        //then
       Assertions.assertEquals(expected, actual);
    }

}

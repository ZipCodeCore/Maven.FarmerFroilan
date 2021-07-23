package com.zipcodewilmington.froilansfarm.animal.person;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.prism.impl.FactoryResetException;
import com.zipcodewilmington.froilansfarm.animals.person.Botanist;
import com.zipcodewilmington.froilansfarm.animals.person.Farmer;
import com.zipcodewilmington.froilansfarm.animals.person.Person;
import com.zipcodewilmington.froilansfarm.animals.person.Rider;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.Egg;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class FarmerTest {


    private Farmer farmer;

    @BeforeEach
    void setUp() {
        Farmer farmer = new Farmer();
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

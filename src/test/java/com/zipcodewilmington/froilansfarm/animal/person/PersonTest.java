package com.zipcodewilmington.froilansfarm.animal.person;

import com.zipcodewilmington.froilansfarm.animals.person.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

    private Person person = new Person();

//    @BeforeEach
//    void setUp() {
//         this.person = new Person();
//    }

   @Test
   public void testConstructor(){
        String actualName = person.getName();
        String expectedName = null;
       Assertions.assertEquals(expectedName, actualName);
   }

    @Test
    public void testSetName(){
        String expectedName = "Froilan";
        person.setName(expectedName);
        String actualName = person.getName();
        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    void makeNoise() {
    }

    @Test
    void eat() {
    }

    @Test
    void getName() {
    }
}

package com.zipcodewilmington.froilansfarm.MammalTests;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Mammal.Farmer;
import com.zipcodewilmington.froilansfarm.Mammal.Person;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testConstructor() {
        //given
        String expected = "Sophia";
        Person person = new Person(expected);
        //when
        String actual = person.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        //given
        String expected = "Tyler";
        //when
        Person person = new Person(expected);
        String actual = person.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMakeNoise() {
        //given
        String expected = "Hello";
        Person person = new Person();
        //when
        String actual = person.makeNoise();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEat() {
        //given
        Person person = new Person();
        //when
        Tomato tomato = new Tomato();
        person.eat(tomato);
        person.getMealList();
        //then
        Assert.assertTrue(person.meals.contains(tomato));
    }

    @Test
    public void testImplementationEater() {
        Person person = new Person();
        Assert.assertTrue(person instanceof Eater);
    }

    @Test
    public void testImplementationNoiseMaker() {
        Person person = new Person();
        Assert.assertTrue(person instanceof NoiseMaker);
    }
}

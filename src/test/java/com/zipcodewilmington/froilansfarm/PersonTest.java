package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Mammal.Person;
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
    public void testImplementation() {
        Person person = new Person("Jonah");
        Assert.assertTrue(person instanceof Eater);
    }
}

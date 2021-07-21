package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void testSetName() {
        //given
        String expected = "Froiland";
        Person person = new Farmer(expected);
        //when
        String actual = person.getName();
        //then
        Assert.assertEquals(expected, actual);
    }
}

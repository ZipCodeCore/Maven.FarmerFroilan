package com.zipcodewilmington.froilansfarm.AnimalTest;

import com.zipcodewilmington.froilansfarm.Animal.Person;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.Vehicle.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    @Test
    public void instanceOfPerson () {
        Pilot p = new Pilot();

        Assert.assertTrue(p instanceof Person);
    }

    @Test
    public void instanceOfRider () {
        Pilot p = new Pilot();

        Assert.assertTrue(p instanceof Rider);
    }
}

package Vehicles;

import com.zipcodewilmington.froilansfarm.Vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicles.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class AircraftTest {

    @Test
    public void constructor(){
        Vehicle aircraft = new Aircraft();

        Boolean actual = aircraft instanceof Vehicle;

        Assert.assertTrue(actual);
    }

    @Test
    public void aircraftTest(){
        Vehicle aircraft = new Aircraft();

        String actual = aircraft.makeNoise();
        String expected = "Bzzzzeewwwwwwwwwww Rat-tat-tat-tat-tat";

        Assert.assertEquals(expected, actual);
    }
}

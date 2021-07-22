package Vehicles;

import com.zipcodewilmington.froilansfarm.Food.Crop;
import com.zipcodewilmington.froilansfarm.Food.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Mammal.Farmer;
import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicles.Vehicle;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {

    @Test
    public void constructorTest1(){
        Vehicle tractor = new Tractor();

        Boolean instance = tractor instanceof Vehicle;

        Assert.assertTrue(instance);
    }

    @Test
    public void constructorTest2(){
        Vehicle tractor = new Tractor();

        Boolean instance = tractor instanceof FarmVehicle;

        Assert.assertTrue(instance);
    }

    @Test
    public void constructorMakeNoise(){
        Vehicle tractor = new Tractor();

        String actual = tractor.makeNoise();
        String expected = "Chuggumgumgumgumgum";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tractorHarvestTest(){
        Vehicle tractor = new Tractor();
        Farmer farmer = new Farmer();
        Crop crop = new TomatoPlant();

        //Needs something testable in regards to tractor.ride
        tractor.ride(farmer);


    }

}

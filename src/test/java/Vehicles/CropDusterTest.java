package Vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Vehicles.*;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {

    @Test
    public void constructorTest1(){
        Tractor tractor = new Tractor();

        Boolean actual = tractor instanceof Vehicle;

        Assert.assertTrue(actual);
    }
    
    @Test
    public void constructorTest2(){
        Tractor tractor = new Tractor();

        Boolean actual = tractor instanceof FarmVehicle;

        Assert.assertTrue(actual);
    }
}

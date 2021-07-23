package Vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.Food.Crop;
import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Food.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Vehicles.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CropDusterTest {

    @Test
    public void constructorTest1(){
        CropDuster duster = new CropDuster();

        Boolean actual = duster instanceof Vehicle;

        Assert.assertTrue(actual);
    }

    @Test
    public void constructorTest2(){
        CropDuster duster = new CropDuster();

        Boolean actual = duster instanceof FarmVehicle;

        Assert.assertTrue(actual);
    }

    @Test
    public void constructorTest3(){
        CropDuster duster = new CropDuster();

        Boolean actual = duster instanceof Aircraft;

        Assert.assertTrue(actual);
    }

//    @Test
//    public void fertilizeTest(){
//        CropDuster duster = new CropDuster();
//
//        CropRow row = new CropRow();
//        duster.fertilizeCrop(row);
//
//        Boolean actual = row.checkFertilized();
//
//        Assert.assertTrue(actual);
//    }

    @Test
    public void shootTest(){
        Aircraft duster = new CropDuster();

        String actual = duster.shoot();
        String expected = "BULLETS";

        Assert.assertEquals(expected, actual);
    }


}

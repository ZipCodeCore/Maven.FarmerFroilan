package com.zipcodewilmington.froilansfarm.AnimalTest;

import com.zipcodewilmington.froilansfarm.Animal.Farmer;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.crops.CornPlant;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.CropRow;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {
    @Test
    public void constructorTest() {
        Farmer farmer = new Farmer();
        String actualName = "Froilan";
        Assert.assertEquals(farmer.getName(), actualName);
    }

    @Test
    public void hasEatenTest() {
        Farmer farmer = new Farmer();
        Boolean actual = false;
        Assert.assertFalse(farmer.hasEaten());
    }

    @Test
    public void plantTest() {
        Farmer farmer = new Farmer();
        CropRow cropRow = new CropRow();
        Integer numberOfCrops = 0;
        Crop crop = new CornPlant();
        Integer expected = 1;
//        cropRow.addCrop(crop);
        farmer.plant(cropRow, crop);
        Assert.assertEquals(expected, farmer.getNumberOfCropsPlanted());

    }

    @Test
    public void mountTest() {
        Farmer farmer = new Farmer();
        Integer expected = 1;

        Rideable vehicle = new Rideable() {
            @Override
            public boolean hasBeenRiden() {
                return true;
            }
        };
        farmer.mount(vehicle);

        Assert.assertEquals(expected, farmer.getNumberOfRidesTaken());

    }

}


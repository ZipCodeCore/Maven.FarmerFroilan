package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.vehicle.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class FarmTest {

    @Test
    public void constructorTest() {
        // Given
        List<FarmHouse> expectedFarmhouses = new ArrayList<>(Arrays.asList(new FarmHouse()));
        List<Stable> expectedStables = new ArrayList<>(Arrays.asList(new Stable()));
        List<ChickenCoop> expectedChickenCoops = new ArrayList<>(Arrays.asList(new ChickenCoop()));
        List<Field> expectedFields = new ArrayList<>(Arrays.asList(new Field()));
        List<Vehicle> expectedVehicles = new ArrayList<>(Arrays.asList(new Vehicle()));

        // When
        Farm farm = new FarmBuilder().setFarmhouses(expectedFarmhouses).setStables(expectedStables).setChickenCoops(expectedChickenCoops).setFields(expectedFields).setVehicles(expectedVehicles).build();
        List<FarmHouse> actualFarmhouses = farm.getFarmhouses();
        List<Stable> actualStables = farm.getStables();
        List<ChickenCoop> actualChickenCoops = farm.getChickenCoops();
        List<Field> actualFields = farm.getFields();
        List<Vehicle> actualVehicles = farm.getVehicles();

        // Then
        Assert.assertEquals(expectedFarmhouses, actualFarmhouses);
        Assert.assertEquals(expectedStables, actualStables);
        Assert.assertEquals(expectedChickenCoops, actualChickenCoops);
        Assert.assertEquals(expectedFields, actualFields);
        Assert.assertEquals(expectedVehicles, actualVehicles);
    }
}

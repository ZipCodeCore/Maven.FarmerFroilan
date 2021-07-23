package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.animals.person.Person;
import com.zipcodewilmington.froilansfarm.vehicle.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShelterTest {

    @Test
    public void chickenCoopConstructorTest() {
        // Given
        List<Chicken> expectedChickens = new ArrayList<>(Arrays.asList(new Chicken(), new Chicken(), new Chicken(), new Chicken()));
        ChickenCoop chickenCoop = new ChickenCoop(expectedChickens);


        // When
        List<Chicken> actualChickens = chickenCoop.getAnimals();

        // Then
        Assert.assertEquals(expectedChickens, actualChickens);
    }

    @Test
    public void stableConstructorTest() {
        // Given
        List<Horse> expectedHorses = new ArrayList<>(Arrays.asList(new Horse(), new Horse(), new Horse(), new Horse()));
        Stable stable = new Stable(expectedHorses);


        // When
        List<Horse> actualHorses = stable.getAnimals();

        // Then
        Assert.assertEquals(expectedHorses, actualHorses);
    }

    @Test
    public void farmHouseConstructorTest() {
        // Given
        List<Person> expectedPeople = new ArrayList<>(Arrays.asList(new Person(), new Person(), new Person(), new Person()));
        FarmHouse farmHouse = new FarmHouse(expectedPeople);


        // When
        List<Person> actualPeople = farmHouse.getAnimals();

        // Then
        Assert.assertEquals(expectedPeople, actualPeople);
    }

    @Test
    public void addTest() {
        // Given
        Person expectedPerson = new Person();
        FarmHouse farmHouse = new FarmHouse();


        // When
        farmHouse.add(expectedPerson);
        List<Person> people = farmHouse.getAnimals();
        Person actualPerson = people.get(0);

        // Then
        Assert.assertEquals(expectedPerson, actualPerson);
    }

    @Test
    public void removeTest() {
        // Given
        Person person1 = new Person();
        Person person2 = new Person();
        FarmHouse farmHouse = new FarmHouse(new ArrayList<>(Arrays.asList(person1, person2)));
        Integer expectedNumberOfPeople = 1;


        // When
        farmHouse.remove(person1);
        Integer actualNumberOfPeople = farmHouse.getNumberOfAnimals();

        // Then
        Assert.assertEquals(expectedNumberOfPeople, actualNumberOfPeople);
    }
}

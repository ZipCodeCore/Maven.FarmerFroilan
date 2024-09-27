package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.Froilan;
import com.zipcodewilmington.froilansfarm.FroilansFarm;
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
        Chicken[] chickens = new Chicken[] {new Chicken(), new Chicken(), new Chicken(), new Chicken()};
        ChickenCoop chickenCoop = new ChickenCoop(chickens);
        List<Chicken> expectedChickens = new ArrayList<>(Arrays.asList(chickens));


        // When
        List<Chicken> actualChickens = chickenCoop.getAnimals();

        // Then
        Assert.assertEquals(expectedChickens, actualChickens);
    }

    @Test
    public void stableConstructorTest() {
        // Given
        Horse[] horses = new Horse[] {new Horse(), new Horse(), new Horse(), new Horse()};
        Stable stable = new Stable(horses);
        List<Horse> expectedHorses = new ArrayList<>(Arrays.asList(horses));


        // When
        List<Horse> actualHorses = stable.getAnimals();

        // Then
        Assert.assertEquals(expectedHorses, actualHorses);
    }

    @Test
    public void farmHouseConstructorTest() {
        // Given
        Person[] people = new Person[] {new Person(), new Person(), new Person(), new Person()};
        FarmHouse farmHouse = new FarmHouse(people);
        List<Person> expectedPeople = new ArrayList<>(Arrays.asList(people));


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
        FarmHouse farmHouse = new FarmHouse(person1, person2);
        Integer expectedNumberOfPeople = 1;


        // When
        farmHouse.remove(person1);
        Integer actualNumberOfPeople = farmHouse.getNumberOfAnimals();

        // Then
        Assert.assertEquals(expectedNumberOfPeople, actualNumberOfPeople);
    }

    @Test
    public void test() {
//        FroilansFarm farm = FroilansFarm.INSTANCE;
//        System.out.println(farm);
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        System.out.println(farm);

    }
}

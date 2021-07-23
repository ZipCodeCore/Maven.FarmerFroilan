package com.zipcodewilmington.froilansfarm.StructureTests;

import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import com.zipcodewilmington.froilansfarm.Mammal.Farmer;
import com.zipcodewilmington.froilansfarm.Mammal.Person;
import com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Structure.FarmHouse;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {

    @Test
    public void testConstructor() {
        //given
        String expected = "Froiland";
        Farmer farmer = new Farmer(expected);
        //when
        FarmHouse farmhouse = new FarmHouse();
        farmhouse.add(farmer);
        //then
        Assert.assertTrue(farmhouse.getPersonList().contains(farmer));
    }

    @Test
    public void testGetObjectByName() {
        //given
        String name = "Frank";
        Person expected = new Farmer(name);
        //when
        FarmHouse farmhouse = new FarmHouse();
        farmhouse.add(expected);
        Person actual = farmhouse.getObjectByName(name);
        //then
        Assert.assertTrue(expected.equals(actual));
    }


    @Test
    public void testAdd() {
        //given
        Person person = new Farmer("Froilan");
        //when
        FarmHouse farmhouse = new FarmHouse();
        farmhouse.add(person);
        //then
        Assert.assertTrue(farmhouse.getPersonList().contains(person));
    }

    @Test
    public void testRemove() {
        //given
        Person person1 = new Farmer("Froilan");
        Person person2 = new Farmer("Froilanda");
        //when
        FarmHouse farmhouse = new FarmHouse();
        farmhouse.add(person1);
        farmhouse.add(person2);
        farmhouse.remove(person1);
        //then
        Assert.assertFalse(farmhouse.getPersonList().contains(person1));
    }

    @Test
    public void testImplementation() {
        FarmHouse farmhouse = new FarmHouse();
        Assert.assertTrue(farmhouse instanceof Shelter);
    }

    @Test
    public void elementTest() {

        //Given
        FarmHouse farmHouse = new FarmHouse();
        Person actual = farmHouse.getObjectByName("Froilan");
        Assert.assertNull(actual);
        farmHouse.add(new Person("Froilan"));

        //When
        actual = farmHouse.getObjectByName("Froilan");

        //Then
        Assert.assertNotNull(actual);
    }

//    @Test
//    public void testGetName() {
//        //given
//        String expected = "Froilan";
//        Person person = new Farmer(expected);
//        //when
//        FarmHouse farmhouse = new FarmHouse();
//        farmhouse.getObjectByName(expected);
//        //then
//        System.out.println(farmhouse.getObjectByName(expected));
//    }
 }

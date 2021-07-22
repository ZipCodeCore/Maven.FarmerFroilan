package com.zipcodewilmington.froilansfarm.AnimalTest;


import com.zipcodewilmington.froilansfarm.Animal.Person;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void constructorTest(){
        Person person =new Person();
        String actualName="";
        Integer amountOfFoodEaten;

        String expectedName=person.getName();
        //then
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void constructorTest2(){
        Person person =new Person();

        Integer actualAmountOfFoodEaten=0;

        Integer expectedAmount=person.getAmountOfFoodEaten();
        //then
        Assert.assertEquals(expectedAmount,actualAmountOfFoodEaten);
    }

    @Test
    public void setNameTest(){
        String name = "Sutara";
        String expected = "Sitara";
        Integer amountOfFoodEaten = 2;
        Person person=new Person(name,amountOfFoodEaten);
        person.setName(expected);
        //when
        String actual=person.getName();

        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setAmountOfFoodTest(){
        String name = "Sitara";
        Integer amountOfFoodEaten = 2;
        Integer expected = 2;
        Person person=new Person(name,amountOfFoodEaten);
        person.setAmountOfFoodEaten(expected);
        //when
        Integer actual=person.getAmountOfFoodEaten();

        //then
        Assert.assertEquals(expected,actual);
    }
}

package AnimalTest;


import Animal.Person;
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
}

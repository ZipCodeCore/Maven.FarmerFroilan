package AnimalTest;
import Animal.Animal;
import org.junit.Test;
import org.junit.Assert;
public class AnimalTest {

    @Test
    public void nullaryConstructorTest(){
        Animal animal=new Animal();
        //when
        int actual=animal.getAge();

        //then
        Assert.assertEquals(0,actual);
    }
    //given

    @Test
    public void nullaryConstructorTest2(){
        Animal animal=new Animal();
        //when
        String actual=animal.getName();

        //then
        Assert.assertEquals("",actual);
    }

    @Test
    public void constructorTest(){
        String name = "Sitara";
        Integer age = 20;
        Integer amountOfFoodEaten = 2;
        Animal animal=new Animal(name,age,amountOfFoodEaten);
        //when
        String actual=animal.getName();

        //then
        Assert.assertEquals("Sitara",actual);
    }
    @Test
    public void getAgeTest(){
        String name = "Sitara";
        Integer age = 20;
        Integer amountOfFoodEaten = 2;
        Animal animal=new Animal(name,age,amountOfFoodEaten);
        //when
        Integer actual=animal.getAge();

        //then
        Assert.assertEquals(age,actual);
    }

    @Test
    public void setAgeTest(){
        String name = "Sitara";
        Integer age = 20;
        Integer expected = 24;
        Integer amountOfFoodEaten = 2;
        Animal animal=new Animal(name,age,amountOfFoodEaten);
        animal.setAge(24);
        //when
        Integer actual=animal.getAge();

        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNameTest(){
        String name = "Sutara";
        Integer age = 20;
        String expected = "Sitara";
        Integer amountOfFoodEaten = 2;
        Animal animal=new Animal(name,age,amountOfFoodEaten);
        animal.setName(expected);
        //when
        String actual=animal.getName();

        //then
        Assert.assertEquals(expected,actual);
    }






}

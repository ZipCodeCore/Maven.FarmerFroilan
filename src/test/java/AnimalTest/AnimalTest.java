package AnimalTest;
import Animal.Animal;
import org.junit.Test;
import org.junit.Assert;
public class AnimalTest {

    @Test
    public void constructorTest(){    Integer age=0;
        Integer amountOfFoodEaten;
        Animal animal=new Animal();
        //when
        int actual=animal.getAge();

        //then
        Assert.assertEquals(0,actual);
    }
    //given

    @Test
    public void constructorTest2(){    Integer age=0;
        Integer amountOfFoodEaten;
        Animal animal=new Animal();
        //when
        String actual=animal.getName();

        //then
        Assert.assertEquals("",actual);
    }




}

package animal;

import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    private Object Chicken;

    @Test
    public void stableTest(){
        //Given
        String expectedAnimal = "Horse";

        //When
        String actualAnimal = "Horse";

        //Then
        Assert.assertEquals(expectedAnimal, actualAnimal);
    }

    @Test
    public void stableTest2(){

    }

}

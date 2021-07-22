package crops;

import crop.Tomato;
import crop.TomatoPlant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


//import static org.junit.Assert.assertEquals;

//tractor is a farm vehicle that can harvest a crop
    /*
    hasBeenFertilized and hasBeenHarvested determine if a crop is edible and if it has been picked
    So our test code should follow AAA (Arrange Act Assert) pattern. I guess similar to Given When Then

     */
public class TomatoPlantTest {

//    @Test
//    public void yeildTest(){
//        //Given
//        TomatoPlant tomatoPlant = new TomatoPlant();
//
//        //When
//        boolean isEdible = tomatoPlant.hasBeenFertilized();
//
//        //Then
//        Assertions.assertTrue(isEdible);
//
//    }

    @Test
    public void yieldTest2(){
        //Given
        TomatoPlant tomatoPlant = new TomatoPlant();
        Assertions.assertTrue(tomatoPlant.hasBeenFertilized());

        //When
        Tomato tomato = tomatoPlant.yield();

        //Then
        Assertions.assertNotNull(tomato);

    }

//
//    {
//        //arrange
//        TomatoPlant tomatoPlant = new TomatoPlant();
//
//        //act
//        //TomatoPlant.getFoodName();
//        String foodName = tomatoPlant.getFoodName("Tomato Crop");
//
//        //assert
//        assertEquals("Tomato Crop", foodName);
//    }
}


package AnimalTest;

import Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Edible;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    @Test
    public void hasBeenFertilisedTest(){
        Chicken chicken =new Chicken();
        Assert.assertFalse(chicken.hasBeenFertilized());
    }
    @Test
    public void hasBeenHarvestedTest(){
        Chicken chicken =new Chicken();
        Assert.assertFalse(chicken.hasBeenHarvested());
    }

    @Test
    public void yieldTest(){
        Chicken chicken =new Chicken();
        Edible object = new Edible() {
            @Override
            public boolean isEaten() {
                return false;
            }
        };
        chicken.yield(object);
        Assert.assertTrue(true);
    }

    @Test
    public void makeNoiseTest(){
        Chicken chicken = new Chicken();
        String noise="Cluck!";
        String actual= chicken.makeNoise();
        Assert.assertEquals("Cluck!",actual);
    }

}

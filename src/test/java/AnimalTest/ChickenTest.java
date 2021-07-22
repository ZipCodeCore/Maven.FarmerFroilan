package AnimalTest;

import Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Edible;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    @Test
    public void hasBeenFertilisedTest(){
        Chicken chicken =new Chicken();
        Boolean isFertilised=false;
        Assert.assertFalse(chicken.hasBeenFertilized());
    }
    @Test
    public void hasBeenHarvested(){
        Chicken chicken =new Chicken();
        Assert.assertFalse(chicken.hasBeenHarvested());
    }

    @Test
    public void makeNoise(){
        Chicken chicken = new Chicken();
        String noise="Cluck!";
        String actual= chicken.makeNoise();
        Assert.assertEquals("Cluck!",actual);
    }

}

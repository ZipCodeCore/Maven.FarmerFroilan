package com.zipcodewilmington.froilansfarm.edible;

//import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zipcodewilmington.froilansfarm.crops.Egg;
import com.zipcodewilmington.froilansfarm.crops.Potato;
import com.zipcodewilmington.froilansfarm.crops.Tomato;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import org.junit.Test;

public class EdibleTest {

    @Test
    public void EdibleFoodTest() {
        Egg edibleEgg = new Egg();
        Egg inedibleEgg = new Egg();
        inedibleEgg.isInedibleEgg();

        Boolean expected = true;
        Boolean actual = edibleEgg.IsEdible();

        inedibleEgg.isInedibleEgg();
        Boolean expected2 = false;
        Boolean actual2 = inedibleEgg.isInedibleEgg();
    }
}

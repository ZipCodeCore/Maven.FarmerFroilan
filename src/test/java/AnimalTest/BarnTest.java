package AnimalTest;

import Animal.Barn;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BarnTest {

    @Test
    public void numberOfAnimalsTest() {
        Barn barn = new Barn();
        List<String> animals = new ArrayList<>();
        animals.add("chicken");
        animals.add("horse");
        animals.add("chick");
        Integer expected = 3;
        Assert.assertEquals(3, animals.size());
    }

    @Test
    public void addTest() {
        Barn barn = new Barn();
        List<String> animals = new ArrayList<>();
        animals.add("chicken");
        animals.toArray();
        Assert.assertEquals("chicken", animals.get(0));

    }

    @Test
    public void removeTest() {
        Barn barn = new Barn();
        List<String> animals = new ArrayList<>();
        animals.add("chicken");
        animals.add("horse");
        animals.remove(0);
        animals.toArray();
        Assert.assertEquals(1, animals.size());
    }
}
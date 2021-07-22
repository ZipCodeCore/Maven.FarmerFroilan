package AnimalTest;

import Animal.Barn;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BarnTest {

    @Test
    public <T> void numberOfAnimalsTest() {
        Barn barn = new Barn();
        List<T> animals = new ArrayList<T>();;

        //List<String> animals = new ArrayList<>();
        animals.add((T) "chicken");
        animals.add((T) "horse");
        animals.add((T) "chick");
        Integer expected = 3;
        barn.setAnimals(animals);
        Assert.assertEquals(expected, barn.numberOfAnimals(animals));
    }

    @Test
    public void addTest() {
        Barn barn = new Barn();
        List<String> animals = new ArrayList<>();
        animals.add("chicken");
        barn.setAnimals(animals);
        //animals.toArray();
        Assert.assertEquals("chicken", barn.getAnimals().get(0));

    }

    @Test
    public void removeTest() {
        Barn barn = new Barn();
        List<String> animals = new ArrayList<>();
        animals.add("chicken");
        animals.add("horse");
        barn.setAnimals(animals);
        barn.remove(animals.get(0));

        Assert.assertEquals(1, barn.getAnimals().size());
    }

    @Test
    public void testGetAnimals() {
        Barn barn = new Barn();
        List<String> animals = new ArrayList<>();
        animals.add("chicken");
        animals.add("horse");
        barn.setAnimals(animals);

        Assert.assertEquals("chicken", barn.getAnimals().get(0));
    }

    @Test
    public void testSetAnimals() {
        Barn barn = new Barn();
        List<String> animals = new ArrayList<>();
        animals.add("chicken");
        animals.add("horse");
        barn.setAnimals(animals);

        Assert.assertEquals("horse", barn.getAnimals().get(1));
    }
}
package com.zipcodewilmington.froilansfarm.testStorage;


import com.zipcodewilmington.froilansfarm.Animal.Barn;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.storage.Stable;
import com.zipcodewilmington.froilansfarm.storage.StorageInterface;
import org.junit.Assert;
import org.junit.Test;

public class StableTest {

    @Test
    public void implementationTest() {
        Stable stable = new Stable();
        Assert.assertTrue(stable instanceof StorageInterface);
    }

    @Test
    public void instanceOfBarn () {
        Stable stable = new Stable();

        Assert.assertTrue(stable instanceof Barn);
    }

    @Test
    public void addTest() {
        Stable stable = new Stable();
        Horse horse = new Horse();
        Horse horse1 = new Horse();
        Integer expected = 2;

        stable.add(horse);
        stable.add(horse1);
        Integer actual = stable.getSize();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        Stable stable = new Stable();
        Horse horse = new Horse();
        Horse horse1 = new Horse();
        Integer expected = 1;

        stable.add(horse);
        stable.add(horse1);
        stable.remove(horse);
        Integer actual = stable.getSize();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getListOfHorsesTest() {
        Stable stable = new Stable();
        Horse horse = new Horse();
        Horse horse1 = new Horse();
        Integer expected = 1;

        stable.add(horse);
        stable.add(horse1);
        stable.remove(horse);
        Integer actual = stable.getSize();

        Assert.assertEquals(expected, actual);
    }
}

package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.crops.Tomato;
import com.zipcodewilmington.froilansfarm.farm.FarmStorage;
import org.junit.Test;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplicationTest {

    @Test
    public void test() {
        FarmStorage storage = FarmStorage.getInstance();
        Froilan froilan = new Froilan();
        System.out.println(storage.getMap().get(new Tomato().getClass()));
        froilan.eat(storage.getFoodItem(new Tomato()));
        System.out.println(storage.getMap().get(new Tomato().getClass()));
    }

}

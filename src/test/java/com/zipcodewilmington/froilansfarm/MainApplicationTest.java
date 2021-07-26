package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.farm.FarmStorage;
import org.junit.Test;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplicationTest {

    @Test
    public void test() {
        FarmStorage farmStorage = FarmStorage.getInstance();
        System.out.println(farmStorage.getMap().toString());
    }

}

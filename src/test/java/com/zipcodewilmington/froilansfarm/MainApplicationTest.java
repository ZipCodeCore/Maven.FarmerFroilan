package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.storage.Farm;
import com.zipcodewilmington.froilansfarm.storage.Stable;
import com.zipcodewilmington.froilansfarm.storage.StorageInterface;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplicationTest {

    @Test
    public void addStorageTest(){
        //given
        Farm<StorageInterface> farm = new Farm<>();
        Stable stable1= new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();
        int expected = 3;

        //when
        farm.add(stable1);
        farm.add(stable2);
        farm.add(stable3);
        int actual = farm.amount();

        //then
        Assert.assertEquals(expected, actual);
    }
}

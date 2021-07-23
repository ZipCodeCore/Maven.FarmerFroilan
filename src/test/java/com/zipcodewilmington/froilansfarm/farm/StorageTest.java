package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crops.Tomato;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class StorageTest {

    @Test
    public void addTest() {
        // Given
        FarmStorage storage = FarmStorage.getInstance();
        Map<Class, List<Class>> map = storage.getMap();

        // When


        // Then
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
    }
}

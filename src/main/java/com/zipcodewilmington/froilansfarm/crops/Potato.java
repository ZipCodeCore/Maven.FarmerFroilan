package com.zipcodewilmington.froilansfarm.crops;

import java.util.ArrayList;
import java.util.List;

public class Potato implements Edible {
    public boolean IsEdible() {
        return true;
    }

    @Override
    public List<Potato> createFood(int numberOfCrops) {
        List<Potato> list = new ArrayList<>();
        for (int i = 0; i < numberOfCrops; i++) {
            list.add(new Potato());
        }
        return list;
    }
}

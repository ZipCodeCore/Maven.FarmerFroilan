package com.zipcodewilmington.froilansfarm.crops;

import java.util.ArrayList;
import java.util.List;

public class Tomato implements Edible{
    public boolean IsEdible() {
        return true;
    }

    @Override
    public List<Tomato> createFood(int numberOfCrops) {
        List<Tomato> list = new ArrayList<>();
        for (int i = 0; i < numberOfCrops; i++) {
            list.add(new Tomato());
        }
        return list;
    }
}

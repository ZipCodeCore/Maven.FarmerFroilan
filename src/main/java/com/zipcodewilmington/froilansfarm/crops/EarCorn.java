package com.zipcodewilmington.froilansfarm.crops;

import java.util.ArrayList;
import java.util.List;

public class EarCorn implements Edible{
    public boolean IsEdible() {
        return true;
    }

    @Override
    public List<EarCorn> createFood(int numberOfCrops) {
        List<EarCorn> list = new ArrayList<>();
        for (int i = 0; i < numberOfCrops; i++) {
            list.add(new EarCorn());
        }
        return list;
    }
}

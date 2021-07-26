package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.farm.FarmStorage;

public interface Eater {

    default public <SomeEdible extends Edible> void eat(SomeEdible food) {
        FarmStorage storage = FarmStorage.getInstance();
        storage.remove(food);
    }
}

package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crops.Edible;

public interface Produce<someType extends Edible> {

    //someType yield();

    boolean hasBeenFertilized();
}

package com.zipcodewilmington.froilansfarm;

public interface Produce {

    void yield(Edible object);

    boolean hasBeenFertilized();

    boolean hasBeenHarvested();
}

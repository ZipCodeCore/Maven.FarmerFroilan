package com.zipcodewilmington.froilansfarm;

public interface Rideable <R extends Rider> {

    void ride(R rider);
}

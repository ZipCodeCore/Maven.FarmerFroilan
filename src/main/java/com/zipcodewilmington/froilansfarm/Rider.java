package com.zipcodewilmington.froilansfarm;

public interface Rider<R extends Ridable> {

    void mount(R rideable);
    void dismount(R rideable);

}

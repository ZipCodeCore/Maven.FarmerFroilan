package com.zipcodewilmington.froilansfarm;

public interface Rider<R extends Rideable> {

    void mount(R rideable);
    void dismount(R rideable);

}

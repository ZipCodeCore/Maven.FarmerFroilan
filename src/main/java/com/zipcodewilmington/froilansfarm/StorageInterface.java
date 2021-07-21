package com.zipcodewilmington.froilansfarm;

import java.lang.reflect.Type;

public interface StorageInterface <TypeToStore> {

    void add(TypeToStore thingYouAreStoring);

    void remove(TypeToStore thingYouAreStoring);

    int amount(TypeToStore thingYouAreStoring);
}

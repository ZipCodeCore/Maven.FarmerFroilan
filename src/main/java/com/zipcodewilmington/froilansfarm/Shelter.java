package com.zipcodewilmington.froilansfarm;

public interface Shelter<ShelterableType> {

    void add(ShelterableType thingToBeStored);

    ShelterableType getTypeByName(String name);

    void remove(ShelterableType thingToBeStored);
}

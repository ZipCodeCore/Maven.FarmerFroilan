package com.zipcodewilmington.froilansfarm;

public interface Shelter<ShelterableType> {

    void add(ShelterableType thingToBeStored);

    ShelterableType getObjectByName(String name);

    void remove(ShelterableType thingToBeStored);
}

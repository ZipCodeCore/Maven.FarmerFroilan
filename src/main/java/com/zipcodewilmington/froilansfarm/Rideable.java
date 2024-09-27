package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.person.Rider;

public interface Rideable <T extends Rider>{

    boolean getIsBeingRidden();

    void setIsBeingRidden(boolean isBeingRidden);
}

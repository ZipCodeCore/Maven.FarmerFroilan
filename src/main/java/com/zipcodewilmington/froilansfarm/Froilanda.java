package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.person.Person;
import com.zipcodewilmington.froilansfarm.animals.person.Pilot;
import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.farm.Farm;

public class Froilanda extends Person implements Pilot {

    Farm farm = FroilansFarm.getInstance();

    public Farm getFarm() {
        return farm;
    }
}

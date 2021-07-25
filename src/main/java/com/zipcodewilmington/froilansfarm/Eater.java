package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edible;

public interface Eater < T extends Edible > {
    void eat(T edible);
}

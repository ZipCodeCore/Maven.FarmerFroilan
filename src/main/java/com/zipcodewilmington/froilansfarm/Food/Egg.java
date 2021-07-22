package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.Edible;

public class Egg implements Edible {

    public static boolean isFertilized;

    public Egg(boolean isFertilized) {
        this.isFertilized = isFertilized;
    }

    public Egg() {
        isFertilized = false;
    }

    public static boolean isIsFertilized() {
        return isFertilized;
    }

    public static void setIsFertilized(boolean isFertilized) {
        Egg.isFertilized = isFertilized;
    }
}

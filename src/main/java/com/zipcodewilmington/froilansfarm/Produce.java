package com.zipcodewilmington.froilansfarm;

public class Produce {
    private Boolean hasBeenFertilized;

    private Produce yield() {
        if(this.hasBeenFertilized){
            return this;
        } else {
            return null;
        }
    }
}

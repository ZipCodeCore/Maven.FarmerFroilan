package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Produce;

public class Chicken extends Animal implements Produce {
    Boolean isFertilized=false;
    Integer eggs;

public Chicken(){}

    public void yield(Edible object) {
        if(this.isFertilized==true){
            this.eggs+=1;
        }
    }

    public boolean hasBeenFertilized() {
        return false;
    }

    public boolean hasBeenHarvested() {
        return false;
    }

    public String makeNoise(){
        return "Cluck!";
    }

    public void eat(Edible Object){

    }
}

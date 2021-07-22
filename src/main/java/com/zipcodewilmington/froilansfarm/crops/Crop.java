package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Produce;

public abstract class Crop implements Produce {
    Integer numOfEdiblesYielded;    //once fertilized
    Integer numOfEdiblesHarvested; //once harvested
    Integer numOfEdiblesEaten; //decrement if eaten


    public Crop(Integer numOfYield, Integer numOfCropsHarvested, Integer numOfEdiblesLeft) {
        this.numOfEdiblesYielded = numOfYield;
        this.numOfEdiblesHarvested = numOfCropsHarvested;
        this.numOfEdiblesEaten = numOfEdiblesLeft;
    }

    public Crop() {
        this.numOfEdiblesYielded = 0;
        this.numOfEdiblesHarvested = 0;
        this.numOfEdiblesEaten = 0;
    }


    public Integer getNumOfEdiblesYielded(){
        return numOfEdiblesYielded;
    }


    public Integer getNumberofHarvest(){
        while(hasBeenHarvested()==true)
        {return numOfEdiblesYielded ;}
        return numOfEdiblesHarvested;
    };

    public Integer getFoodToEat(){
        return numOfEdiblesHarvested-numOfEdiblesEaten;
    }
}

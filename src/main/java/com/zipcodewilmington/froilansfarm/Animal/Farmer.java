package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.Vehicle.Botanist;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.CropRow;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends Person implements Rider, Eater, Botanist {
    int numberOfRidesTaken;
    int numberOfCropsPlanted;
    int numberOfEdiblesEaten;
    // List<Edible> thingsEaten;
    String name = "Froilan";
    Rideable vehicle;


    public Farmer(Integer numberOfRidesTaken, Integer numberOfCropsPlanted, Integer numberOfEdiblesEaten
            , String name, ArrayList<Edible> thingsEaten) {
        this.numberOfRidesTaken = numberOfRidesTaken;
        this.numberOfCropsPlanted = numberOfCropsPlanted;
        this.numberOfEdiblesEaten = numberOfEdiblesEaten;
        this.name = name;
        //this.thingsEaten = thingsEaten;

    }

    public Farmer() {
    }

    public String getName() {
        return name;
    }

    public void mount(Rideable object) {
        this.vehicle = object;
        if (object.hasBeenRiden()) {
            incrementRidesTaken();
        }
    }

    public Integer getNumberOfRidesTaken() {
        return numberOfRidesTaken;
    }

    public void dismount(Rideable object) {
        this.vehicle = null;
    }

    public void eat(Edible object) {
        if (object.isEaten()) {
            incrementFoodEaten();
        } else {
            throw new UnsupportedOperationException("No new produce to eat:(");
        }
    }

    public boolean hasEaten() {
        return false;
    }

    public void plant(CropRow cropRow, Crop crop) {
        cropRow.addCrop(crop);
       incrementNumberOfPlants();

    }

    public Integer getNumberOfCropsPlanted() {
        return numberOfCropsPlanted;
    }

    public void setNumberOfPlants(Integer num) {
        this.numberOfCropsPlanted = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void incrementNumberOfPlants(){
        setNumberOfPlants(getNumberOfCropsPlanted()+1);
    }

    public void incrementFoodEaten(){
        setAmountOfFoodEaten(getAmountOfFoodEaten()+1);
    }
    public void incrementRidesTaken(){
        numberOfRidesTaken++;

    }
}

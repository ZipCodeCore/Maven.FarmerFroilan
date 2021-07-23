package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;
import com.zipcodewilmington.froilansfarm.storage.StorageInterface;

import java.util.ArrayList;
import java.util.List;

public class Farm <StorageInterface>{

   List<StorageInterface> farm = new ArrayList<>();
   Field field;
   List<Vehicle> vehicles = new ArrayList<>();
   List<Animal> farmAnimals = new ArrayList<>();

    public Farm () {
    // This is a test, nerd
    }

    public Farm (Field field, List<StorageInterface> farm, List<Animal> farmAnimals, List<Vehicle> vehicles){
        this.field = new Field();
        this.farm = new ArrayList<>();
        this.farmAnimals = new ArrayList<>();
        this.vehicles = new ArrayList<>();
    }



    public void addShelter(StorageInterface storage) {
        farm.add(storage);

    }


    public void removeShelter( StorageInterface storage) {
        farm.remove(storage);
    }


    public int amountShelter() {
        return farm.size();
    }

    public int getAmountofCoops(){
        int numOfOccurences = 0;
        for (StorageInterface s : farm) {
            if (s instanceof ChickenCoop){
                numOfOccurences++;
            }

        }
        return numOfOccurences;
    }

    public int getAmountofStable(){
        int numOfOccurences = 0;
        for (StorageInterface s : farm) {
            if (s instanceof Stable){
                numOfOccurences++;
            }

        }
        return numOfOccurences;
    }
}

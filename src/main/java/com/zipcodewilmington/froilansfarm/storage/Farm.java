package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;
import com.zipcodewilmington.froilansfarm.storage.StorageInterface;

import java.util.ArrayList;
import java.util.List;

public class Farm <StorageInterface>{

   List<StorageInterface> farm = new ArrayList<>();
   Field field;
   List<Vehicle> vehicles = new ArrayList<>();

    public Farm () {
    // This is a test, nerd
    }


    public void add(StorageInterface storage) {
        farm.add(storage);

    }


    public void remove( StorageInterface storage) {
        farm.remove(storage);
    }


    public int amount() {
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

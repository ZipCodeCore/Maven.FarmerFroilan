package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;
import com.zipcodewilmington.froilansfarm.storage.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/26/18.
 */
    public class MainApplication {
    //holds a list of the days of the week
    //each day is its own class
    //each day class has its own "Runnable" schedule
    //make fertilize method
    //make check fertilization method (hasBeenFertilized)
    //potentially make Farmer abstract so that Froilan and Froilanda can both be declared new Farmers
    //
    public static void main(String[] args) {
        Farm<StorageInterface> farm = new Farm<>();
        Stable stable1= new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();
        farm.addShelter(stable1);
        farm.addShelter(stable2);
        farm.addShelter(stable3);
        ChickenCoop coop1 = new ChickenCoop();
        ChickenCoop coop2= new ChickenCoop();
        ChickenCoop coop3= new ChickenCoop();
        ChickenCoop coop4 = new ChickenCoop();
        farm.addShelter(coop1);
        farm.addShelter(coop2);
        farm.addShelter(coop3);
        farm.addShelter(coop4);
        int size = farm.amountShelter();
        int coops = farm.getAmountofCoops();

        System.out.println(size);
        System.out.println(coops);

}
    public void createFarm(Field field, List<StorageInterface> shelters, List<Animal> mammals, List <Vehicle> vehicles){
        Farm instance = new Farm(field, shelters, mammals, vehicles);
        ChickenCoop coop1 = new ChickenCoop();
        ChickenCoop coop2= new ChickenCoop();
        ChickenCoop coop3= new ChickenCoop();
        ChickenCoop coop4 = new ChickenCoop();
        shelters.add(coop1);
        shelters.add(coop2); //this is a bit tedious

    }
}

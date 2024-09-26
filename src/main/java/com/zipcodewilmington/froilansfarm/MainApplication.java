package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.storage.Farm;
import com.zipcodewilmington.froilansfarm.storage.Stable;
import com.zipcodewilmington.froilansfarm.storage.StorageInterface;

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
        farm.add(stable1);
        farm.add(stable2);
        farm.add(stable3);
        ChickenCoop coop1 = new ChickenCoop();
        ChickenCoop coop2= new ChickenCoop();
        ChickenCoop coop3= new ChickenCoop();
        ChickenCoop coop4 = new ChickenCoop();
        farm.add(coop1);
        farm.add(coop2);
        farm.add(coop3);
        farm.add(coop4);
        int size = farm.amount();
        int coops = farm.getAmountofCoops();

        System.out.println(size);
        System.out.println(coops);

}
}

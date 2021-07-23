package com.zipcodewilmington.froilansfarm.vehicle;

//import com.sun.scenario.effect.Crop;
import com.zipcodewilmington.froilansfarm.crops.Potato;


public class Tractor implements FarmVehicle<Vehicle>{

    private int crop;

     public Tractor(int crop){
         this.crop = crop;

     }
     public boolean harvest(int crop) {
        return true;

    }
    @Override
    public boolean operate() {
        return true;
    }
}

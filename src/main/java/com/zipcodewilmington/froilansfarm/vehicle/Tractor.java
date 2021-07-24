package com.zipcodewilmington.froilansfarm.vehicle;


import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.FarmStorage;

public class Tractor extends Vehicle implements FarmVehicle<Vehicle>{



public class Tractor implements FarmVehicle<Vehicle>{

    private Crop crop;

     public Tractor(Crop crop){
         this.crop = crop;


//    public void harvest(CropRow cropRow){
//        FarmStorage storage = FarmStorage.getInstance();
//        storage.add(cropRow.getCrop());
//    }


         public void operate(Object vehicle) {

    }


    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public void move() {

    }

}

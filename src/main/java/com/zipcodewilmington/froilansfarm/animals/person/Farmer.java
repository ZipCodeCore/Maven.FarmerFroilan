package com.zipcodewilmington.froilansfarm.animals.person;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.FarmStorage;

public class Farmer extends Person implements Rider, Botanist {
//    private String name;
   public Farmer(){

   }

    public Farmer(String name) {
        super(name);
    }

    public <SomeRide extends Rideable> void mount(SomeRide ride) {
        ride.setIsBeingRidden(true);
    }

    @Override
    public <SomeRide extends Rideable> void dismount(SomeRide ride) {
        ride.setIsBeingRidden(false);
    }

    public String makeNoise(){
        return "YeeHaw!";
    }


    public <SomeEdible extends Edible> void storeCrop(SomeEdible... someEdibles) {
       FarmStorage storage = FarmStorage.getInstance();
       for (SomeEdible food : someEdibles) {
           storage.add(food);
       }
    }
}

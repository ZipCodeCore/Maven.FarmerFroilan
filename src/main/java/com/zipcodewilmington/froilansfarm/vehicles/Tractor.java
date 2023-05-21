package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.plants.Crop;

public class Tractor extends FarmVehicle {

    public Edible harvest(Crop crop) {
        crop.harvest();
        return crop.yield();
    }

}

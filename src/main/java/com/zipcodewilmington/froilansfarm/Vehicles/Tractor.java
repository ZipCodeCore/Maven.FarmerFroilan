package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Food.Crop;
import com.zipcodewilmington.froilansfarm.Rider;

public class Tractor implements FarmVehicle{

    public Crop harvest(Crop crop){
        return null;
    }


    public String makeNoise() {
        return null;
    }


    @Override
    public void ride(Rider rider) {

    }

    @Override
    public void operate(Farm farm) {

    }
}

package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animal.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Animal.Rider;


public interface Vehicle extends NoiseMaker, Rideable {
    public Vehicle operate(Rider rider);

}

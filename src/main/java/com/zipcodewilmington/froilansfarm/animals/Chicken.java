package com.zipcodewilmington.froilansfarm.animals;


import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.crops.Egg;
import com.zipcodewilmington.froilansfarm.farm.FarmStorage;
//import com.zipcodewilmington.froilansfarm.farm.Produce;

public class Chicken extends Animal {

    public String makeNoise() {
        return "cluck!" ;
    }

    public void yield(Egg... egg) {
        FarmStorage storage = FarmStorage.getInstance();
        for (Egg eggi : egg) {
            if (!eggi.getHasBeenFertilized()) {
                storage.add(eggi);
            }
        }
    }
}

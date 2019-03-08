package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public abstract class Mammal implements NoiseMaker, Eater {

    private Integer caloricIntake;

    public Integer getCaloricIntake() {
        return caloricIntake;
    }

    public void addCalories(Integer caloricIntake) {
        this.caloricIntake = this.caloricIntake + caloricIntake;
    }


}

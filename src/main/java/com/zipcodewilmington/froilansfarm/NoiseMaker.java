package com.zipcodewilmington.froilansfarm;

public interface NoiseMaker {
    default String makeNoise() {
        return "Ahhhhhhh";
    }
}

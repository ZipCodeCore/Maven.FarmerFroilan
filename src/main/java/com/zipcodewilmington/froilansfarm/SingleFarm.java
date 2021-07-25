package com.zipcodewilmington.froilansfarm;

public class SingleFarm {
    private static final SingleFarm INSTANCE = new SingleFarm();


    SingleFarm (){};

    public static SingleFarm getInstance(){
        return INSTANCE;
    }


}

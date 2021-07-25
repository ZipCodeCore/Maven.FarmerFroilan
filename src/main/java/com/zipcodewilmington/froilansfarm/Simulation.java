package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Mammal.*;
import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Structure.Stable;
import com.zipcodewilmington.froilansfarm.Vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import java.util.Arrays;

public class Simulation implements Runnable {
    public static void main(String[] args) {
        new Simulation().run();
    }

    public void run() {
    Weekdays weekdays = new Weekdays(new Farm());
    weekdays.tuesday();
    weekdays.wednesday();
    weekdays.thursday();
    weekdays.friday();
    weekdays.saturday();
    weekdays.sunday();
    weekdays.monday();

        System.out.println("some stuff");
    }
}



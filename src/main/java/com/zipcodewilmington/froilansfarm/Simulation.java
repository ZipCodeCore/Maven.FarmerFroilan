package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import com.zipcodewilmington.froilansfarm.Mammal.Horse;
import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

public class Simulation {
    public static void main(String[] args) {
      run();
    }

    public static void run() {

        Farm farm = new Farm();
        Field field = new Field();
        CropRow cropRow = new CropRow();
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken = new Chicken();
        Horse horse = new Horse();
        FarmVehicle tractor = new Tractor();
        Aircraft cropDuster = new Aircraft();


    }
}

package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import com.zipcodewilmington.froilansfarm.Mammal.Farmer;
import com.zipcodewilmington.froilansfarm.Mammal.Horse;
import com.zipcodewilmington.froilansfarm.Mammal.Person;
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

        Farm farm = new Farm();
        Person froilan = new Farmer("Froilan");
        Rider<CropDuster> froilanda = new Pilot();
        Field field = new Field();
        EarCorn earCorn = new EarCorn();
        CropRow cropRow = new CropRow();
        FarmVehicle tractor1 = new Tractor();
        FarmVehicle tractor2 = new Tractor();
        Aircraft cropDuster = new Aircraft();



        Stable stable = new Stable();
        ChickenCoop chickenCoop = new ChickenCoop();
        Arrays
                .asList("Felipe", "Oscar", "Marvey", "Lorraine", "Sally",
                        "Eggetha Christie", "Dr. Bawk", "Chicklette", "Mz. Cluck",
                        "Lil peep", "Harry", "Meghen", "Amantha", "Christephanie", "Henrietta")
                .forEach(name -> chickenCoop.add(new Chicken(name)));

        Arrays
                .asList("Party Skips Frank Greta Harry Milo Hoovey Yorgle Tom Sarah".split(" "))
                .forEach(name -> stable.add(new Horse(name)));

    }
}


// list.string.map

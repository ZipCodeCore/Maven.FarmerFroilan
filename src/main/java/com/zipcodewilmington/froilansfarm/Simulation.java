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


        // Person froilan = new Farmer("Froilan");
        // Rider<CropDuster> froilanda = new Pilot();
        Farm farm = new Farm();
        Field field = new Field();
        EarCorn earCorn = new EarCorn();
        CropRow cropRow = new CropRow();
        FarmVehicle tractor1 = new Tractor();
        FarmVehicle tractor2 = new Tractor();
        Aircraft cropDuster = new CropDuster<>();

        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();
        ChickenCoop chickenCoop1 = new ChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        ChickenCoop chickenCoop3 = new ChickenCoop();

        Arrays
                .asList("Felipe", "Oscar", "Marvey", "Lorraine", "Sally", "Lil peep")
                .forEach(name ->chickenCoop1.add(new Chicken(name)));

        Arrays
                .asList("Eggetha Christie Dr. Bawk Chicklette Mz. Cluck".split(""))
                .forEach(name -> chickenCoop2.add(new Chicken(name)));

        Arrays
                .asList("Harry Meghen Amantha Christephanie Henrietta".split(" "))
                .forEach(name -> chickenCoop3.add(new Chicken(name)));

        Arrays
                .asList("Party Skips Frank Greta".split(" "))
                .forEach(name -> stable1.add(new Horse(name)));

        Arrays
                .asList("Yorgle Tom Sarah".split(" "))
                .forEach(name -> stable2.add(new Horse(name)));


        Arrays
                .asList("Harry Milo Hoovey".split(" "))
                .forEach(name -> stable3.add(new Horse(name)));

    }
}


// list.string.map

package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Mammal.Animal;
import com.zipcodewilmington.froilansfarm.Mammal.Chicken;
import com.zipcodewilmington.froilansfarm.Mammal.Farmer;
import com.zipcodewilmington.froilansfarm.Mammal.Person;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication{

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Person person1 = new Person();
        System.out.println(person1.makeNoise());
        Animal chicken1 = new Chicken();
        System.out.println(chicken1.makeNoise());
        Person farmer1 = new Farmer();
        System.out.println(farmer1.makeNoise());

    }


}

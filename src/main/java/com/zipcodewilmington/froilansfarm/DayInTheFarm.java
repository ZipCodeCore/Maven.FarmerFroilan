package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Egg;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import com.zipcodewilmington.froilansfarm.shelter.*;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;

public class DayInTheFarm{

    /*This class will be passed  a day, and return the events of the day that
    occured based on the class
    interactions First, we create instances of the farm and everything on it.
    I know I could make factory classes for this nonsense. But.....nah.*/

    DayInTheFarm(){}
    Egg egg=new Egg();
    Corn corn=new Corn();
    Tomato tomato=new Tomato(); //Lets call the whole thing off~
    Tractor tractor=new Tractor("Dumb tractor");
    CropDuster duster=new CropDuster("A stupid plane");
    Farm theFarm=new Farm();
    Farmer froilan=new Farmer("Froilan");
    Pilot froilana=new Pilot("Froilana");

    Horse h1=new Horse("SeaBiscuit");
    Horse h2=new Horse("Black Beauty");
    Horse h3=new Horse("Zorro's horse");
    Horse h4=new Horse("Tina's Favorite");
    Horse h5=new Horse("Applejack");
    Horse h6=new Horse("Clipclop");
    Horse h7=new Horse("That one horse from Shadow of the Colossus");
    Horse h8=new Horse("Elmer");
    Horse h9=new Horse("Look guys, there's only so many horse names I can think up.");
    Horse h10=new Horse("The Last horseName");
    Chicken c1 = new Chicken("Oh god we're naming the chickens");
    Chicken c2 = new Chicken("Eggmaker Deluxe");
    Chicken c3 = new Chicken("Usopp");
    Chicken c4 = new Chicken("The lion, like from Wizard of oz.");
    Chicken c5 = new Chicken("Hercule");
    Chicken c6 = new Chicken("Mr. Satan");
    Chicken c7 = new Chicken("Get it? They're all Cowardly.");
    Chicken c8 = new Chicken("So they're all chickens. Anime Chickens.");
    Chicken c9 = new Chicken("Hoo boy, still got a lot to name, huh?");
    Chicken c10 = new Chicken("Beaky");
    Chicken c11 = new Chicken("Squawker");
    Chicken c12 = new Chicken("Omlette");
    Chicken c13 = new Chicken("The Colonel");
    Chicken c14 = new Chicken("Mr. Bawk b-gawk");
    Chicken c15 = new Chicken("The last of the chickens");

    Field theField=new Field();
    FoodInventory silo=new FoodInventory();


    public void justBuildTheStupidFarmAlready(){
        //First our farmers moe into the Farmhouse.
        theFarm.moveIn(froilan);
        theFarm.moveIn(froilana);
        //They build coops, and fill them with the 15 chicken they bought.
        theFarm.addCoop(new ChickenCoop());
        theFarm.addCoop(new ChickenCoop());
        theFarm.addCoop(new ChickenCoop());
        theFarm.addCoop(new ChickenCoop());
        theFarm.getChickenCoops().get(0).add(c1);
        theFarm.getChickenCoops().get(0).add(c2);
        theFarm.getChickenCoops().get(0).add(c3);
        theFarm.getChickenCoops().get(0).add(c4);
        theFarm.getChickenCoops().get(1).add(c5);
        theFarm.getChickenCoops().get(1).add(c6);
        theFarm.getChickenCoops().get(1).add(c7);
        theFarm.getChickenCoops().get(1).add(c8);
        theFarm.getChickenCoops().get(2).add(c9);
        theFarm.getChickenCoops().get(2).add(c10);
        theFarm.getChickenCoops().get(2).add(c11);
        theFarm.getChickenCoops().get(2).add(c12);
        theFarm.getChickenCoops().get(3).add(c13);
        theFarm.getChickenCoops().get(3).add(c14);
        theFarm.getChickenCoops().get(3).add(c15);
        //They then built stables, to store their 10 horses.
        theFarm.addStable(new Stables());
        theFarm.addStable(new Stables());
        theFarm.addStable(new Stables());
        theFarm.getStables().get(0).add(h1);
        theFarm.getStables().get(0).add(h2);
        theFarm.getStables().get(0).add(h3);
        theFarm.getStables().get(0).add(h4);
        theFarm.getStables().get(1).add(h5);
        theFarm.getStables().get(1).add(h6);
        theFarm.getStables().get(1).add(h7);
        theFarm.getStables().get(1).add(h8);
        theFarm.getStables().get(2).add(h9);
        theFarm.getStables().get(2).add(h10);
        //They make rows in the field to plant the crops
        theField.add(new CropRow());
        theField.add(new CropRow());
        theField.add(new CropRow());
        theField.add(new CropRow());
        theField.add(new CropRow());
        //they plant 10 corn in row 1, 10 tomato in row 2, and whatever else they felt like that day.
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(3).add(new CornStalk());
        theField.get(3).add(new CornStalk());
        theField.get(3).add(new CornStalk());
        theField.get(3).add(new CornStalk());
        theField.get(3).add(new CornStalk());
        theField.get(3).add(new CornStalk());
        theField.get(3).add(new CornStalk());
        theField.get(3).add(new CornStalk());
        theField.get(3).add(new CornStalk());
        theField.get(3).add(new CornStalk());
        theField.get(3).add(new CornStalk());
        theField.get(4).add(new CornStalk());
        theField.get(4).add(new CornStalk());
        theField.get(4).add(new CornStalk());
        theField.get(4).add(new CornStalk());
        theField.get(4).add(new CornStalk());
        theField.get(4).add(new CornStalk());
        theField.get(4).add(new CornStalk());
        theField.get(4).add(new CornStalk());
        theField.get(4).add(new CornStalk());
        //Start everyone out with food so they don't instantly starve.
        for (int i=0;i<100;i++){silo.add(corn);}
        for (int i=0;i<10;i++){silo.add(tomato);}
        for (int i=0;i<20;i++){silo.add(egg);}
    }

    public void goodMorning(){
        /*Morning checklist:
    Feeding each Horse 3 ear of Corn.
    Chickens are smaller, so they'll eat 2 ears of corn a day.
    Froilan eats 1 EarCorn, 2 Tomoato, and 5 Egg.
    Froilanda eats 2 EarCorn, 1 Tomoato, and 2 Egg.*/
        System.out.println("The sun's up lazybones, get to work! It's morning. First we gotta ride these horses, get em some excersize.");
        //Horse riding at the crack of dawn!
        froilan.mount(h1);
        froilan.dismount(h1);
        froilan.mount(h2);
        froilan.dismount(h2);
        froilan.mount(h3);
        froilan.dismount(h3);
        froilan.mount(h4);
        froilan.dismount(h4);
        froilan.mount(h5);
        froilan.dismount(h5);
        froilana.mount(h6);
        froilana.dismount(h6);
        froilana.mount(h7);
        froilana.dismount(h7);
        froilana.mount(h8);
        froilana.dismount(h8);
        froilana.mount(h9);
        froilana.dismount(h9);
        froilana.mount(h10);
        froilana.dismount(h10);

        //Time to feed the damn things
        feedHorse(h1);
        feedHorse(h2);
        feedHorse(h3);
        feedHorse(h4);
        feedHorse(h5);
        feedHorse(h6);
        feedHorse(h7);
        feedHorse(h8);
        feedHorse(h9);
        feedHorse(h10);
        feedChicken(c1);
        feedChicken(c2);
        feedChicken(c3);
        feedChicken(c4);
        feedChicken(c5);
        feedChicken(c6);
        feedChicken(c7);
        feedChicken(c8);
        feedChicken(c9);
        feedChicken(c10);
        feedChicken(c12);
        feedChicken(c13);
        feedChicken(c14);
        feedChicken(c15);
    }
    //Horseys are big, they need 3 ear of corn a day
    public void feedHorse(Horse h){

        h.eat(corn, silo);
        h.eat(corn, silo);
        h.eat(corn, silo);
    }
    //chickens only eat 2 corn a day
    public void feedChicken(Chicken c){
        c.eat(corn, silo);
        c.eat(corn, silo);
    }

    public void froilanBreakfast(Farmer f){
        f.eat(corn, silo);
        f.eat(tomato, silo);
        f.eat(tomato, silo);
        f.eat(egg, silo);
        f.eat(egg, silo);
        f.eat(egg, silo);
        f.eat(egg, silo);
        f.eat(egg, silo);


    }
    public void froilanaBreakfast(Pilot f){
        f.eat(corn, silo);
        f.eat(egg, silo);
        f.eat(corn, silo);
        f.eat(egg, silo);
        f.eat(tomato, silo);
    }



}

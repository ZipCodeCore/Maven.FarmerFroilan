package com.zipcodewilmington.froilansfarm.weekdays;

import com.zipcodewilmington.froilansfarm.Froilan;
import com.zipcodewilmington.froilansfarm.Froilanda;
import com.zipcodewilmington.froilansfarm.FroilansFarm;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.crops.EarCorn;
import com.zipcodewilmington.froilansfarm.crops.Egg;
import com.zipcodewilmington.froilansfarm.crops.Tomato;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.FarmStorage;
import com.zipcodewilmington.froilansfarm.farm.Stable;
import org.junit.Assert;
import org.junit.Test;

public class Tuesday {

    FarmStorage storage = FarmStorage.getInstance();
    Farm farm = FroilansFarm.getInstance();
    Froilan froilan = new Froilan();
    Froilanda froilanda = new Froilanda();

    @Test
    public void rideEachHorse() {
        // Given
        int expectedNumberOfHorsesRidden = 10;
        int actualNumberOfHorsesRidden = 0;

        // When
        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.getAnimals()) {
                froilan.mount(horse);
                if (horse.getIsBeingRidden()) {
                    actualNumberOfHorsesRidden++;
                }
                froilan.dismount(horse);
            }
        }
        // Then
        Assert.assertEquals(expectedNumberOfHorsesRidden,actualNumberOfHorsesRidden);
    }

    @Test
    public void feedEachHorse() {
        // Given
        int numberOfCornInStorage = storage.getNumberOfItems(new EarCorn());
        int expectedNumberOfCorn = numberOfCornInStorage - 30;

        // When
        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.getAnimals()) {
                horse.eat(storage.getFoodItem(new EarCorn()));
                horse.eat(storage.getFoodItem(new EarCorn()));
                horse.eat(storage.getFoodItem(new EarCorn()));
            }
        }
        int actualNumberOfCorn = storage.getNumberOfItems(new EarCorn());

        // Then
        Assert.assertEquals(expectedNumberOfCorn,actualNumberOfCorn);
    }

    @Test
    public void breakfastForFroilanAndFroilanda() {
        // Given
        int numberOfCornInStorage = storage.getNumberOfItems(new EarCorn());
        int numberOfTomatoInStorage = storage.getNumberOfItems(new Tomato());
        int numberOfEggInStorage = storage.getNumberOfItems(new Egg());
        int expectedNumberOfCorn = numberOfCornInStorage - 3;
        int expectedNumberOfTomato = numberOfTomatoInStorage - 3;
        int expectedNumberOfEgg = numberOfEggInStorage - 7;

        // When
        froilan.eat(storage.getFoodItem(new EarCorn()));
        froilan.eat(storage.getFoodItem(new Tomato())); froilan.eat(storage.getFoodItem(new Tomato()));
        froilan.eat(storage.getFoodItem(new Egg())); froilan.eat(storage.getFoodItem(new Egg())); froilan.eat(storage.getFoodItem(new Egg())); froilan.eat(storage.getFoodItem(new Egg())); froilan.eat(storage.getFoodItem(new Egg()));
        froilanda.eat(storage.getFoodItem(new EarCorn())); froilanda.eat(storage.getFoodItem(new EarCorn()));
        froilanda.eat(storage.getFoodItem(new Tomato()));
        froilanda.eat(storage.getFoodItem(new Egg())); froilanda.eat(storage.getFoodItem(new Egg()));
        int actualNumberOfCorn = storage.getNumberOfItems(new EarCorn());
        int actualNumberOfTomato = storage.getNumberOfItems(new Tomato());
        int actualNumberOfEgg = storage.getNumberOfItems(new Egg());

        // Then
        Assert.assertEquals(expectedNumberOfCorn,actualNumberOfCorn);
        Assert.assertEquals(expectedNumberOfTomato,actualNumberOfTomato);
        Assert.assertEquals(expectedNumberOfEgg,actualNumberOfEgg);
    }
}

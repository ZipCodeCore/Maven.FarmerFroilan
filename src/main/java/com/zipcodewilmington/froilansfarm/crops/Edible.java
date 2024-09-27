package com.zipcodewilmington.froilansfarm.crops;

import java.util.List;

public interface Edible {

    boolean IsEdible(); //check if food is edible or not

    <SomeEdible extends Edible> List<SomeEdible> createFood(int numberOfCrops);



}

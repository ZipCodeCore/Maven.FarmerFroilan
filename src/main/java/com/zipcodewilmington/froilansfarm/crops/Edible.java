package com.zipcodewilmington.froilansfarm.crops;

import java.util.List;

public interface Edible {

    public boolean IsEdible(); //check if food is edible or not

    public <SomeEdible extends Edible> List<SomeEdible> createFood(int numberOfCrops);

}

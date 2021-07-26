package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crops.*;

import java.util.*;

public class FarmStorage <SomeEdible extends Edible> {

    private static class FarmStorageHelper {
        private static final FarmStorage INSTANCE = new FarmStorage();
    }

    private List<? extends Edible> list = new ArrayList<>();
    private Map<Class<? extends Edible>, List<? extends Edible>> map = constructMap();



    private FarmStorage() {
    }

    public static FarmStorage getInstance() {
        return FarmStorageHelper.INSTANCE;
    }

    public <SomeEdible extends Edible> void add(SomeEdible foodItem) {
        List<SomeEdible> list = (List<SomeEdible>) map.get(foodItem.getClass());
        list.add(foodItem);
    }

    public <SomeEdible extends Edible> void remove(SomeEdible foodItem) {
        List<SomeEdible> list = (List<SomeEdible>) map.get(foodItem.getClass());
        list.remove(foodItem);
    }

    private void populateMap() {
        Tomato tomato = new Tomato();
        Potato potato = new Potato();
        Egg egg = new Egg();
        EarCorn earCorn = new EarCorn();
        map.put(tomato.getClass(), tomato.createFood(400));
        map.put(potato.getClass(), potato.createFood(400));
        map.put(egg.getClass(), egg.createFood(400));
        map.put(earCorn.getClass(), earCorn.createFood(400));
    }


    private Map<Class<? extends Edible>, List<? extends Edible>> constructMap() {
        map = new HashMap<>();
        populateMap();
        return map;
    }

    public Map<Class<? extends Edible>, List<? extends Edible>> getMap() {
        return map;
    }

    public SomeEdible getFoodItem(SomeEdible someEdible) {
        List<? extends Edible> edibleList = map.get(someEdible.getClass());
            return (SomeEdible) edibleList.get(0);
    }

    public Integer getNumberOfItems(SomeEdible someEdible) {
        List<? extends Edible> edibleList = map.get(someEdible.getClass());
        return edibleList.size();
    }
}

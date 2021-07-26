package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crops.*;

import java.util.*;

public class FarmStorage {

    private static FarmStorage farmStorage;

    private List<? extends Edible> list = new ArrayList<>();
    private Map<Class<? extends Edible>, List<? extends Edible>> map = constructMap();



    private FarmStorage() {
    }

    public static FarmStorage getInstance() {
        if (farmStorage == null) {
            farmStorage = new FarmStorage();
            return farmStorage;
        }
        return farmStorage;
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
        map.put(tomato.getClass(), tomato.createFood(20));
        map.put(potato.getClass(), potato.createFood(20));
        map.put(egg.getClass(), egg.createFood(20));
        map.put(earCorn.getClass(), earCorn.createFood(20));
    }


    private Map<Class<? extends Edible>, List<? extends Edible>> constructMap() {
        map = new HashMap<>();
        populateMap();
        return map;
    }

    public Map<Class<? extends Edible>, List<? extends Edible>> getMap() {
        return map;
    }
}

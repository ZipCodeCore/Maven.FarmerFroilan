package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crops.*;

import java.util.*;

public class FarmStorage <SomeEdible extends Edible> {

    private static FarmStorage farmStorage;

    private List<SomeEdible> list = new ArrayList<>();
    private Map<Class<SomeEdible>, List<SomeEdible>> map = constructMap();



    private FarmStorage() {
    }

    public static FarmStorage getInstance() {
        if (farmStorage == null) {
            farmStorage = new FarmStorage();
            return farmStorage;
        }
        return farmStorage;
    }

    public void add(SomeEdible foodItem) {
        List<SomeEdible> list = map.get(foodItem.getClass());
        list.add(foodItem);
    }

    public void remove(SomeEdible foodItem) {
        List<SomeEdible> list = map.get(foodItem.getClass());
        list.remove(foodItem);
    }

    public void populateMap() {
        Tomato tomato = new Tomato();
        Potato potato = new Potato();
        Egg egg = new Egg();
        EarCorn earCorn = new EarCorn();
        map.put((Class<SomeEdible>) tomato.getClass(), null);
        map.put((Class<SomeEdible>) potato.getClass(), null);
        map.put((Class<SomeEdible>) egg.getClass(), null);
        map.put((Class<SomeEdible>) earCorn.getClass(), null);
    }

    public Map<Class<SomeEdible>, List<SomeEdible>> constructMap() {
        map = new HashMap<>();
        populateMap();
        return map;
    }

    public Map<Class<SomeEdible>, List<SomeEdible>> getMap() {
        return map;
    }
}

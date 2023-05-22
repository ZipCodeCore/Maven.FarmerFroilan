package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable {

    private List<Horse> horses = new ArrayList<>();

    public void addHorse(Horse horse) {
        horses.add(horse);
    }

    public Stable(List<Horse> horses) {
        this.horses = horses;
    }

    public Stable() {}

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Stable{" +
                "horses=" + horses +
                '}';
    }
}

package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Horse;

import java.util.List;

public class Stable {

    private List<Horse> horses;

    public Stable(List<Horse> horses) {
        this.horses = horses;
    }

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

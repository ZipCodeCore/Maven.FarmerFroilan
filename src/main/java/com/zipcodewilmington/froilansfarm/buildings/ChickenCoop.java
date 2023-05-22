package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Chicken;

import java.util.ArrayList;

public class ChickenCoop {

    Chicken[] chickenList = new ArrayList<>().toArray(new Chicken[0]);

    public ChickenCoop(Chicken[] chickenList) {
        this.chickenList = chickenList;
    }

    public Chicken[] getChickenList() {
        return chickenList;
    }

    public void setChickenList(ArrayList<Chicken> chickenList) {
        this.chickenList = chickenList.toArray(new Chicken[0]);
    }

    @Override
    public String toString() {
        return "ChickenCoop{" +
                "chickenList=" + chickenList +
                '}';
    }
}

package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class ChickenCoop {

    public ChickenCoop() {

        this.chickenCoop = new ArrayList<>();
    }

    public ArrayList<Integer> getChickenCoop() {
        return chickenCoop;
    }

    public void setChickenCoop(ArrayList<Integer> chickenCoop) {
        this.chickenCoop = chickenCoop;
    }

    private ArrayList<Integer> chickenCoop;
}

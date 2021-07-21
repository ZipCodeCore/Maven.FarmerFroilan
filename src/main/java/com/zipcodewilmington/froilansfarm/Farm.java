package com.zipcodewilmington.froilansfarm;

public abstract class Farm {
    private FarmHouse farmhouse;
    private Stable stable;
    private ChickenCoop chickenCoop;

    public FarmHouse getFarmhouse() {
        return farmhouse;
    }

    public void setFarmhouse(FarmHouse farmhouse) {
        this.farmhouse = farmhouse;
    }

    public Stable getStable() {
        return stable;
    }

    public void setStable(Stable stable) {
        this.stable = stable;
    }

    public ChickenCoop getChickenCoop() {
        return chickenCoop;
    }

    public void setChickenCoop(ChickenCoop chickenCoop) {
        this.chickenCoop = chickenCoop;
    }
}

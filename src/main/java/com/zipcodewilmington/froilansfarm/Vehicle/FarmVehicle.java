package com.zipcodewilmington.froilansfarm.Vehicle;

public class FarmVehicle implements Vehicle {
    String onFarm;
    String offFarm;
    String location;

    public FarmVehicle(String onFarm, String offFarm, String location) {
        this.onFarm = onFarm;
        this.offFarm = offFarm;
        this.location = location;
    }

    public FarmVehicle() {

    }

    public void setLocation(String expected) {
        this.location = expected;
    }

    public String getLocation() {
        return this.location;
    }

    public Boolean operation(String location) {
        return location.equals(onFarm);
    }

    @Override
    public String noiseMaker() {
        return null;
    }

    @Override
    public boolean hasBeenRiden() {
        return false;
    }

    public String getOnFarm() {
        return onFarm;
    }

    public void setOnFarm(String onFarm) {
        this.onFarm = onFarm;
    }
}

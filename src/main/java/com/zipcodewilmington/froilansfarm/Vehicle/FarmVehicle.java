package com.zipcodewilmington.froilansfarm.Vehicle;

public class FarmVehicle implements Vehicle{
    String onFarm;
    String offFarm;
    String location;

    public FarmVehicle(){
        onFarm="Can Operate.";
        offFarm= "Can't Operate.";
        location ="";
    }
    public void setLocation(String expected){ this.location=location;
    }

    public String getLocation() {
        return this.location;
    }

    public String operation(String location){
        if(location==onFarm){
            return onFarm;
        }return offFarm;
    }

    @Override
    public String noiseMaker() {
        return null;
    }

    @Override
    public boolean hasBeenRiden() {
        return false;
    }
}

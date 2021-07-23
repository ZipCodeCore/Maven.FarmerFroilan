package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Food.Crop;
import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Rider;

import java.util.ArrayList;
import java.util.List;

public class Tractor implements FarmVehicle{
    private Rider rider;
    private List<Edible> aList = new ArrayList<>();

    public void harvest(Edible crop){
        aList.add(crop);
    }


    public String makeNoise() {
        return "Chuggumgumgumgumgum";
    }



    public void ride(Rider rider) {
        this.rider = rider;
    }

    public void operate(Farm farm) {
        List<CropRow> rows = farm.getField().getMyField();
        for(int i = 0; i < rows.size(); i++){
            ArrayList<Edible> listOfCrops =  rows.get(i).harvestRow();
            for(int j = 0; j < listOfCrops.size(); j++){
                harvest(listOfCrops.get(j));
            }
        }
    }

    public List<Edible> getaList() {
        return aList;
    }

    public Rider getRider() {
        return rider;
    }
}

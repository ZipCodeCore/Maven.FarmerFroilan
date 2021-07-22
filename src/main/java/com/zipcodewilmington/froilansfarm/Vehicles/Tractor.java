package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Food.Crop;
import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Rider;

import java.util.ArrayList;
import java.util.List;

public class Tractor implements FarmVehicle{
    private Rider rider;
    private List<Crop> aList = new ArrayList<>();

    public void harvest(Crop crop){
        aList.add(crop);
    }


    public String makeNoise() {
        return "Chuggumgumgumgumgum";
    }


    @Override
    public void ride(Rider rider) {
        this.rider = rider;
    }

    @Override
    public void operate(Farm farm) {
        List<CropRow> rows = farm.getField().getMyField();
        for(int i = 0; i < rows.size(); i++){
            rows.get(i).fertilizeRow();
        }
    }

}

package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Food.CropRow;

public class CropDuster extends Aircraft implements FarmVehicle{

   public void fertilizeCrop(CropRow row){
      row.fertilize();
   }

   @Override
   public void operate(Farm farm) {

   }
}

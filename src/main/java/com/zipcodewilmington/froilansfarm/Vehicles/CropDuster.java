package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.Food.CropRow;

public class CropDuster extends Aircraft implements FarmVehicle{

   public void fertilizeCrop(CropRow row){
      row.fertilizeRow();
   }


   public void operate(Farm farm) {
      for(CropRow element : farm.getField().getMyField()){
         element.fertilizeRow();
      }
   }
}

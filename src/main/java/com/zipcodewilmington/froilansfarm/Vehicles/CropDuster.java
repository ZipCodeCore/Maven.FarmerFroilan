package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Pilot;
import com.zipcodewilmington.froilansfarm.Rider;

public class CropDuster<T extends Rider> extends Aircraft implements FarmVehicle {
   private Pilot pilot;


   public void fertilizeCrop(CropRow row){
      row.fertilizeRow();
   }

   @Override
   public void ride(Rider rider) {
      this.pilot = pilot;
   }

   @Override
   public void operate(Farm farm) {
      for(CropRow element : farm.getField().getMyField()){
         element.fertilizeRow();
      }
   }
}

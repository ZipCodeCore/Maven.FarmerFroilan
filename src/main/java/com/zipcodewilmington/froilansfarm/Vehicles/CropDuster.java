package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.Food.CropRow;
import com.zipcodewilmington.froilansfarm.Pilot;
import com.zipcodewilmington.froilansfarm.Rider;

public class CropDuster<T extends Rider> extends Aircraft implements FarmVehicle {
   private Pilot pilot;

   public void fly(Field field) {
      for(CropRow element : field.getMyField()){
         element.fertilizeRow();
      }
   }


   @Override
   public void ride(Rider rider) {
      this.pilot = (Pilot)rider;
   }

   @Override
   public void operate(Farm farm) {
      this.fly(farm.getField());
   }

   public Pilot getPilot() {
      return pilot;
   }
}

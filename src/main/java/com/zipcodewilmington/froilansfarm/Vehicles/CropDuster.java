package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Food.CropRow;

public abstract class CropDuster extends Aircraft implements FarmVehicle{

   public void fertilizeCrop(CropRow row){
      row.fertilizeRow();
   }

}

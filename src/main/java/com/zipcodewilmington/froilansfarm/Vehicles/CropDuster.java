package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Food.CropRow;

public abstract class CropDuster extends Aircraft{
   public void fertilize(CropRow row){
      row.fertilize();
   }
}

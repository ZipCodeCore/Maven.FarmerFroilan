package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.Farm;

public interface FarmVehicle {

   default public boolean operate(Farm farm) {
      if (farm != null) {
         return true;
      }
      return false;
   }


}

//in test class use tractor

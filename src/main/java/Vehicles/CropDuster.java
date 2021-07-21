package Vehicles;

import com.zipcodewilmington.froilansfarm.CropRow;

public abstract class CropDuster extends Aircraft{
   public void fertilize(CropRow row){
      row.fertilize();
   }
}

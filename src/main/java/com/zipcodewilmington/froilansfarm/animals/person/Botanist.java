package com.zipcodewilmington.froilansfarm.animals.person;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.crops.Egg;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.FarmStorage;

public interface Botanist {
     default void plant(Crop crop, CropRow row) {
          row.addCropsToRow(crop);
     }
}

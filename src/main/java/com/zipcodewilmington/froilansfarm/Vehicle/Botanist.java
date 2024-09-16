package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.CropRow;

public interface Botanist {
    public void plant(CropRow cropRow, Crop crop);

    void setNumberOfPlants(Integer num);

}

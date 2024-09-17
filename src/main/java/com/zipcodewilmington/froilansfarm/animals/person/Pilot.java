package com.zipcodewilmington.froilansfarm.animals.person;

import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;

public interface Pilot {

    void fly(CropDuster cropDuster, Field field);
}

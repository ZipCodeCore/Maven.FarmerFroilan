package com.zipcodewilmington.froilansfarm.Mammal;

import com.zipcodewilmington.froilansfarm.Botanist;
import com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.Food.Crop;
import com.zipcodewilmington.froilansfarm.Food.CropRow;

public class Froilan extends Farmer implements Botanist {

    String name;

    public Froilan(String name) { super(name); }

    public Froilan() { name = "Froilan"; }

    public void plant(Crop crop, CropRow cropRow) {
        cropRow.plantCrop(crop);
    }

    public void plantRows(Field field) {
        field.getMyField().get(0);
    }
}

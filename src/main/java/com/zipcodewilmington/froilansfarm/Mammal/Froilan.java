package com.zipcodewilmington.froilansfarm.Mammal;

import com.zipcodewilmington.froilansfarm.Botanist;
import com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.Food.*;

public class Froilan extends Farmer implements Botanist {
    private static final Froilan froilan = new Froilan();

    public static Froilan getInstance() { return froilan; }

    public Froilan() { super("Froilan"); }


    public void plant(Crop crop, CropRow cropRow) {
        cropRow.plantCrop(crop);
    }

    public void plantRows(Field field) {
        this.plant(new CornStalk(), field.getMyField().get(0));
        this.plant(new TomatoPlant(), field.getMyField().get(1));
        this.plant(new CarrotFlower(), field.getMyField().get(2));
        this.plant(new CornStalk(), field.getMyField().get(3));
        this.plant(new TomatoPlant(), field.getMyField().get(4));
    }
}

package com.zipcodewilmington.froilansfarm;






import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.animals.person.Farmer;
import com.zipcodewilmington.froilansfarm.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.PotatoRoot;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.farm.*;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
//import com.zipcodewilmington.froilansfarm.vehicle.Tractor;

import java.util.ArrayList;
import java.util.Arrays;

public class Froilan extends Farmer {

    Farm farm = FroilansFarm.getInstance();

    public Farm getFarm() {
        return farm;
    }
}

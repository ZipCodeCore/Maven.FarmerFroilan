package Animal;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.Vehilce.Botanist;
import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class Farmer extends Person implements Rider, Eater, Botanist {
    Integer numberOfRidesTaken;
    Integer numberOfCropsPlanted;
    Integer numberOfEdiblesEaten;
    List<Edible> thingsEaten;
     String name="Froilan";


    public Farmer( Integer numberOfRidesTaken,Integer numberOfCropsPlanted,Integer numberOfEdiblesEaten
            ,String name,ArrayList<Edible> thingsEaten){
        this.numberOfRidesTaken=numberOfRidesTaken;
        this.numberOfCropsPlanted=numberOfCropsPlanted;
        this.numberOfEdiblesEaten=numberOfEdiblesEaten;
        this.name=name;
        this.thingsEaten = thingsEaten;

     }

     public Farmer(){
         this.thingsEaten= new ArrayList<Edible>();
     }

    public String getName() {
        return name;
    }

    public void mount(Rideable object) {

    }

    public void dismount(Rideable object) {

    }

    public void eat(Edible object) {

    }

    public boolean hasEaten() {
        return false;
    }

    public void plant(Crop Object) {

    }

    public int setNumberOfPlants() {
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }
}

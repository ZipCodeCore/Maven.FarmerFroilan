package Animal;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Produce;

public class Chicken extends Animal implements Produce {
    Boolean isFertilized=false;
    Integer eggs;

public Chicken(){}

    public void yield(Edible object) {
        if(isFertilized==true){
            eggs+=1;
        }
        else {
            isFertilized=false;
        }
    }

    public boolean hasBeenFertilized() {
        return false;
    }

    public boolean hasBeenHarvested() {
        return false;
    }

    public String makeNoise(){
        return "Cluck!";
    }

    public void eat(Edible Object){

    }
}

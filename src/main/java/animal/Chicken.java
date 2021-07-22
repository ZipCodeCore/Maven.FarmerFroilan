package animal;

import Interface.Edible;
import Interface.NoiseMaker;
import Interface.Produce;

import java.util.List;

public class Chicken extends Animal implements Produce, NoiseMaker {

    public Chicken(String name) {
        super(name);
    }


    public List<Edible> getStomach() {
        return null;
    }


    public String makeNoise() {

        return null;
    }


    public Boolean hasBeenFertilized() {
        return hasBeenFertilized();
    }
}

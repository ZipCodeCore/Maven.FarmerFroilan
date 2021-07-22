package animal;

import Interface.Edible;
import Interface.NoiseMaker;
import Interface.Rideable;

import java.util.List;

public class Horse extends Animal implements Rideable, NoiseMaker {

    public Horse(String name) {
        super(name);
    }

    @Override
    public List<Edible> getStomach() {
        return null;
    }

    @Override
    public String makeNoise() {

        return null;
    }
}

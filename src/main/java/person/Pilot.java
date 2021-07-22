package person;

import Interface.Eater;
import Interface.Edible;
import Interface.NoiseMaker;

import java.util.List;

public class Pilot extends Person implements NoiseMaker, Eater<Edible> {
    public Pilot(String name) {
        super(name);
    }
    public String makeNoise(){

        return null;
    }


    @Override
    public List<Edible> getStomach() {
        return null;
    }
}

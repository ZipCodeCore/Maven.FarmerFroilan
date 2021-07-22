package person;

import Interface.*;

import java.util.List;

public class Farmer extends Person implements NoiseMaker, Rider, Eater<Edible> {


    public Farmer(String name) {
        super(name);
    }

    public String makeNoise(){

        return "Hi, I am a farmer!";
    }

    @Override
    public List<Edible> getStomach() {
        return null;
    }

    @Override
    public void mount(Rideable rideable) {

    }

    @Override
    public void disMount() {

    }
}

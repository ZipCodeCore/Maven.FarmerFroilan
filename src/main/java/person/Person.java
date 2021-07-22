package person;

import Interface.*;
import animal.Animal;

public abstract class Person extends Animal implements NoiseMaker, Eater<Edible> {
    String name;


    public Person(String name) {
        super(name);
        this.name = name;

    }

    public String getName() {
        return name;
    }


    public String makeNoise() {

        return null;
    }

}

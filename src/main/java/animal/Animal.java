package animal;

import Interface.Eater;
import Interface.Edible;
import Interface.NoiseMaker;

import java.util.ArrayList;

public abstract class Animal implements NoiseMaker, Eater<Edible> {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }
}

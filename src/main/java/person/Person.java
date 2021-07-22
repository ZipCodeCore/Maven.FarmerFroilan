package person;

import Interface.*;

public abstract class Person implements NoiseMaker, Rider, Eater<Edible> {
    String name;

    public void Person(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }

    public void mount(Rideable rideable){

    }
    public void disMount(){

    }
    public void  makeNoise(){

    }

}

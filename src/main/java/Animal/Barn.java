package Animal;

import java.util.ArrayList;
import java.util.List;

public class Barn<T> {
    List<T> animals;

    public Barn() {
        animals = new ArrayList<T>();
    }

    public Integer numberOfAnimals(T animal){
    return animals.size();
    }
    public void add(T animal) {
        animals.add(animal);
    }

    public void remove(T animal) {
        animals.remove(animal);
    }
}
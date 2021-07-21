package Animal;

import java.util.ArrayList;
import java.util.List;

public class Barn<T> {
    List<T> animals;

    public Barn(){
        animals= new ArrayList<T>();
    }
    public void add(T animal){
        animals.add(animal);
    }
}

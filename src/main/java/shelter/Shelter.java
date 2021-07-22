package shelter;

import animal.Animal;

import java.util.ArrayList;
import java.util.Iterator;

public class Shelter<SomeAnimalType extends Animal> implements Iterable{
    private ArrayList<SomeAnimalType> animals;
    public Shelter() {
        this.animals=new ArrayList<SomeAnimalType>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return animals.size();
    }

    public void add(SomeAnimalType object) {
        animals.add(object);
    }

    public Boolean contains(SomeAnimalType object) {
        return animals.contains(object);
    }

    public void remove(SomeAnimalType object) {
        animals.remove(object);
    }

    public SomeAnimalType get(Integer index) {
        return animals.get(index);
    }

    @Override
    public Iterator<SomeAnimalType> iterator() {
        return animals.iterator();
    }
}

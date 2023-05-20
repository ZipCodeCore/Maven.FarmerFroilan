package Farm;

import java.lang.reflect.Type;

public abstract class Crop implements Produce {
    private boolean hasBeenHarvested;
    private boolean hasBeenFertilized;

    public Crop() {
        this.hasBeenHarvested = false;
        this.hasBeenFertilized = false;
    }


    public void fertilize() {
        this.hasBeenFertilized = true;
    }
    public void harvest() {
        this.hasBeenHarvested = true;
    }

    @Override
    public void yield(Edible edible) {

        this.hasBeenHarvested = true;
        EdibleEgg egg = new EdibleEgg();
        edible.eat(egg);
    }

}

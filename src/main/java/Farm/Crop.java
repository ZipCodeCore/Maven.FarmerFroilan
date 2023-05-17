package Farm;

import java.lang.reflect.Type;

public abstract class Crop implements Produce {
    private boolean hasBeenHarvested;
    private boolean hasBeenFertilized;

    public Crop() {
        this.hasBeenHarvested = false;
        this.hasBeenFertilized = false;
    }

    @Override
    public void yield(Edible edible) {

        this.hasBeenHarvested = true;
        EdibleEgg egg = new EdibleEgg();
        edible.eat(egg);
    }


}

package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

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

<<<<<<< HEAD:src/main/java/Farm/Crop.java
    @Override
    public void yield(Edible edible) {

        this.hasBeenHarvested = true;
        EdibleEgg egg = new EdibleEgg();
        edible.eat(egg);
    }

=======
>>>>>>> 89fef60c05d52d32c7b0308f0d45a4a6d9f1d060:src/main/java/com/zipcodewilmington/froilansfarm/plants/Crop.java
}

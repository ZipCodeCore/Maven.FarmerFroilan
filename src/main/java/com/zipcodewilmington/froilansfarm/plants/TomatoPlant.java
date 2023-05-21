package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class TomatoPlant extends Crop {
        public TomatoPlant() {
            super();
        }

        public TomatoPlant(boolean hasBeenFertilized, boolean hasBeenHarvested) {
            super();
        }

        public Edible yield() {
            if (this.isHasBeenFertilized() && this.isHasBeenHarvested()) {
                return new Tomato();
            } else {
                return null;
            }
        }
}

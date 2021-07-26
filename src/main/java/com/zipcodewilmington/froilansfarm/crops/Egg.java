package com.zipcodewilmington.froilansfarm.crops;

import java.util.ArrayList;
import java.util.List;

public class Egg implements Edible{

        private boolean hasBeenFertilized = false;

        public boolean IsEdible() {
                return true;
        }

        @Override
        public List<Egg> createFood(int numberOfCrops) {
                List<Egg> list = new ArrayList<>();
                for (int i = 0; i < numberOfCrops; i++) {
                        list.add(new Egg());
                }
                return list;
        }

        public boolean isInedibleEgg() {
                return false;
        }

        public boolean getHasBeenFertilized() {
                return hasBeenFertilized;
        }

        public void setHasBeenFertilized(boolean hasBeenFertilized) {
                this.hasBeenFertilized = hasBeenFertilized;
        }

}

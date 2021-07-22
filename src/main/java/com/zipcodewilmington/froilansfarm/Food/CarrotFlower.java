package com.zipcodewilmington.froilansfarm.Food;

public class CarrotFlower extends Crop{

    public CarrotFlower(Integer id){
        super(id);
    }

    public CarrotFlower(){
    }

    @Override
    public Carrot yield () {
        if(this.checkFertilized() && !this.checkHarvested()){  // does check harvested have to be false in order to harvest th corn?
            this.setHarvested(true);
            return new Carrot();
        }
        return null;
    }
}

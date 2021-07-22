package com.zipcodewilmington.froilansfarm.Food;

public class CornStalk extends Crop {

    public CornStalk(){
    }

    @Override
    public EarCorn yield () {
        if(this.checkFertilized() && this.checkHarvested()){
            return new EarCorn();
        }
        return null;
    }

}
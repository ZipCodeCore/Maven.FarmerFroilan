package person;

import Interface.Edible;
import farm.CropRow;

import java.util.List;

public class Botanist extends Person{

    public Botanist(String name){
        super(name);
    }
    public void plantCrop(CropRow cropRow){

    }

    @Override
    public List<Edible> getStomach() {
        return null;
    }



}

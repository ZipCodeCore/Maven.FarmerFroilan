package shelter;

import animal.Horse;

import java.util.ArrayList;

public class Stable {
    ArrayList<Horse> horseList = new ArrayList<>();

    public void addHorse(Horse horse){
        horseList.add(horse);
    }
    public void removeHorse(Horse horse){
        horseList.remove(horse);
    }


}

package Animal;

public class Person {
    String name;
    int amountOfFoodEaten;

    public Person(String name,int amountOfFoodEaten){
        this.name=name;
        this.amountOfFoodEaten=amountOfFoodEaten;
    }

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package Interface;

import java.util.List;

public interface Eater <TypeOfFood extends Edible> {

    List<TypeOfFood> getStomach();
    default void eat(TypeOfFood food) {
        getStomach().add(food);
    }
}

package com.zipcodewilmington.froilansfarm.storage;

import java.util.List;

public interface StorageInterface <TypeToStore> {
    List<TypeToStore> getList();

    default Integer getSize(){
        return getList().size();
    }


    default void add(TypeToStore animal) {
        getList().add(animal);
    }

    default void remove(TypeToStore animal) {
        getList().remove(animal);
    }
}

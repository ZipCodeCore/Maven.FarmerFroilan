package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private List<Field> fields = new ArrayList<>();

    public Farm(List<Field> fields) {
        this.fields.addAll(fields);
    }

    public Farm(Field field) {
        this.fields.add(field);
    }

    public List<Field> getFields() {
        return this.fields;
    }

    public void addFields(Field... fields) {
        this.fields.addAll(List.of(fields));
    }

}

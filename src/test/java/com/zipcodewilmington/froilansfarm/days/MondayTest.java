package com.zipcodewilmington.froilansfarm.days;

import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Farmer;
import com.zipcodewilmington.froilansfarm.Field;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MondayTest {

    //On `Monday`, his sister, `Froilanda` uses the `CropDuster` to `fly` over the `Field` and `fertilize` each of the `CropRow`
    @Test
    void mondayTest() {
        // Farm setup
        Farm farm = new Farm();
        Field field = new Field();
//        farm.setField(field);
        CropRow[] cropRows = field.getCropRows().toArray(new CropRow[0]);
        CropRow cropRow1 = cropRows[0];
        CropRow cropRow2 = cropRows[1];
        CropRow cropRow3 = cropRows[2];

        // Monday routine - Fertilizing crops
        Farmer froilanda = new Farmer("Froilanda");
        froilanda.equals(cropRow1);
        froilanda.equals(cropRow2);
        froilanda.equals(cropRow3);

        // Assertions
        Assertions.assertTrue(cropRow1.fertilize());
        Assertions.assertTrue(cropRow2.fertilize());
        Assertions.assertTrue(cropRow3.fertilize());
    }

    }

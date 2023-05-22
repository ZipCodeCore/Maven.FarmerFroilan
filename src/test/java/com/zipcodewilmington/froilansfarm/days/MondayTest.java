package com.zipcodewilmington.froilansfarm.days;

import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Farmer;
import com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.plants.Cornstalk;
import com.zipcodewilmington.froilansfarm.plants.Crop;
import com.zipcodewilmington.froilansfarm.plants.TomatoPlant;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.zipcodewilmington.froilansfarm.days.Monday.monday;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MondayTest {

    //On `Monday`, his sister, `Froilanda` uses the `CropDuster` to `fly` over the `Field` and `fertilize` each of the `CropRow`
    @Test
    void mondayTest() {
        //GIVEN
        Farmer froilanda = new Farmer("Froilanda");
        CropDuster cropDuster = new CropDuster();
        Crop corn1 = new Cornstalk();
        Crop corn2 = new Cornstalk();
        Crop corn3 = new Cornstalk();
        Crop corn4 = new Cornstalk();
        Crop tomato1 = new TomatoPlant();
        Crop tomato2 = new TomatoPlant();
        Crop tomato3 = new TomatoPlant();
        Crop tomato4 = new TomatoPlant();
        CropRow cropRow1 = new CropRow(Arrays.asList(corn1, corn2));
        CropRow cropRow2 = new CropRow(Arrays.asList(corn3, corn4));
        CropRow cropRow3 = new CropRow(Arrays.asList(tomato1, tomato2));
        CropRow cropRow4 = new CropRow(Arrays.asList(tomato3, tomato4));
        Field field = new Field(Arrays.asList(cropRow1, cropRow2, cropRow3, cropRow4));

        //WHEN
        monday(froilanda, cropDuster, field);

        // Assertions
        assertTrue(corn1.isFertilized());
        assertTrue(corn2.isFertilized());
        assertTrue(corn3.isFertilized());
        assertTrue(corn4.isFertilized());
        assertTrue(tomato1.isFertilized());
        assertTrue(tomato2.isFertilized());
        assertTrue(tomato3.isFertilized());
        assertTrue(tomato4.isFertilized());
    }

}

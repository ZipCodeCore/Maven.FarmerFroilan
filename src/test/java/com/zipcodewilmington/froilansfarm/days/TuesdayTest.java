package com.zipcodewilmington.froilansfarm.days;

import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Farmer;
import com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.food.Corn;
import com.zipcodewilmington.froilansfarm.food.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.plants.Cornstalk;
import com.zipcodewilmington.froilansfarm.plants.Crop;
import com.zipcodewilmington.froilansfarm.plants.TomatoPlant;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.zipcodewilmington.froilansfarm.days.Tuesday.tuesday;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TuesdayTest {

    @Test
    void tuesdayTest() {
        //GIVEN
        Farmer farmer = new Farmer("Froilan");
        Tractor tractor = new Tractor();
        Crop corn1 = new Cornstalk();
        corn1.fertilize();
        Crop corn2 = new Cornstalk();
        corn2.fertilize();
        Crop corn3 = new Cornstalk();
        corn3.fertilize();
        Crop corn4 = new Cornstalk();
        Crop tomato1 = new TomatoPlant();
        Crop tomato2 = new TomatoPlant();
        tomato2.fertilize();
        Crop tomato3 = new TomatoPlant();
        tomato3.fertilize();
        Crop tomato4 = new TomatoPlant();
        tomato4.fertilize();
        CropRow cropRow1 = new CropRow(Arrays.asList(corn1, corn2));
        CropRow cropRow2 = new CropRow(Arrays.asList(corn3, corn4));
        CropRow cropRow3 = new CropRow(Arrays.asList(tomato1, tomato2));
        CropRow cropRow4 = new CropRow(Arrays.asList(tomato3, tomato4));
        Field field1 = new Field(Arrays.asList(cropRow1, cropRow2));
        Field field2 = new Field(Arrays.asList(cropRow3, cropRow4));

        //WHEN
        List<Edible> result1 = tuesday(farmer, tractor, field1);
        List<Edible> expected1 = List.of(new Corn(), new Corn(), new Corn());
        List<Edible> result2 = tuesday(farmer, tractor, field2);
        List<Edible> expected2 = List.of(new Tomato(), new Tomato(), new Tomato());

        //THEN
        assertTrue(corn1.isHarvested());
        assertTrue(corn2.isHarvested());
        assertTrue(corn3.isHarvested());
        assertTrue(corn4.isHarvested());
        assertTrue(tomato1.isHarvested());
        assertTrue(tomato2.isHarvested());
        assertTrue(tomato3.isHarvested());
        assertTrue(tomato4.isHarvested());
        assertEquals(result1.size(), expected1.size());
        assertTrue(result1.get(0) instanceof Corn);
        assertTrue(result1.get(1) instanceof Corn);
        assertTrue(result1.get(2) instanceof Corn);
        assertEquals(result2.size(), expected2.size());
        assertTrue(result2.get(0) instanceof Tomato);
        assertTrue(result2.get(1) instanceof Tomato);
        assertTrue(result2.get(2) instanceof Tomato);
    }

}

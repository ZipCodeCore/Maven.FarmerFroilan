package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.crops.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FieldTest {

    @Test
    public void constructorTest() {
        // Given
        CropRow cropRow1 = new CropRow(new TomatoPlant(true, true));
        CropRow cropRow2 = new CropRow(new PotatoRoot(true, true));
        CropRow cropRow3 = new CropRow(new CornStalk(true, true));
        List<CropRow> expectedCropRows = Arrays.asList(cropRow1, cropRow2, cropRow3);

        // When
        Field field = new Field(cropRow1, cropRow2, cropRow3);
        List<CropRow> actualCropRows = field.getRowsInField();

        // Then
        Assert.assertEquals(expectedCropRows, actualCropRows);
    }
}

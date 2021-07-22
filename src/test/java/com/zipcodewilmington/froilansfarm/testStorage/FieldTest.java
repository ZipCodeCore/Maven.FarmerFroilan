package com.zipcodewilmington.froilansfarm.testStorage;

import com.zipcodewilmington.froilansfarm.crops.CropRow;
import com.zipcodewilmington.froilansfarm.storage.Field;
import com.zipcodewilmington.froilansfarm.storage.StorageInterface;
import org.junit.Assert;
import org.junit.Test;

public class FieldTest {

    @Test
    public void implementationTest() {
        Field field = new Field();
        Assert.assertTrue(field instanceof StorageInterface);
    }

    @Test
    public void addTest() {
        Field field = new Field();
        CropRow cr = new CropRow();
        CropRow cr2 = new CropRow();
        Integer expected = 2;

        field.add(cr);
        field.add(cr2);
        Integer actual = field.getListOfCropRow();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        Field field = new Field();
        CropRow cr = new CropRow();
        CropRow cr2 = new CropRow();
        Integer expected = 1;

        field.add(cr);
        field.add(cr2);
        field.remove(cr);
        Integer actual = field.getListOfCropRow();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAmountTest() {
        Field field = new Field();
        CropRow cr = new CropRow();
        CropRow cr2 = new CropRow();
        Integer expected = 1;

        field.add(cr);
        field.add(cr2);
        field.remove(cr);
        Integer actual = field.getListOfCropRow();

        Assert.assertEquals(expected, actual);
    }
}

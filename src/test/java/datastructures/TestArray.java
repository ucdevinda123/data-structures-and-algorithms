package datastructures;

import datastructures.array.java.CustomArray;
import org.junit.Assert;
import org.junit.Test;

public class TestArray {

    @Test
    public void testDynamicArrayJava() {
        CustomArray<Integer> customArray = new CustomArray<>(5);
        customArray.add(10);
        customArray.add(20);
        customArray.add(30);
        Assert.assertEquals(0, customArray.indexOf(10));
        customArray.removeAt(1);
        Assert.assertEquals(1, customArray.indexOf(30));
        customArray.removeAt(0);
        Assert.assertEquals(0, customArray.indexOf(30));
        customArray.removeAt(0);
        Assert.assertEquals(true, customArray.isEmpty());
        customArray.add(50);
        customArray.add(60);
        customArray.add(70);
        customArray.add(80);
        customArray.add(90);
        customArray.add(100);
        customArray.add(110);

        Assert.assertEquals(110, customArray.indexOf(customArray.getSize() - 1));
    }

}

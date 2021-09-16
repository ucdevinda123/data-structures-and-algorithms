package sortingalgorithms.countingsort;

import org.junit.Assert;
import org.junit.Test;
import sortingalgorithms.countingsort.java.CountingSort;

public class CountingSortTest {
    @Test
    public void testCountingSortEmptyJava() {
        int[] arrayInput = {};
        int[] arrayExpected = {};
        new CountingSort().sort(arrayInput, 0);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testCountingSortWithDataJava() {
        int[] arrayInput = {30, 4, 3, 50, 60, 12, 1, 21, 3};
        int[] arrayExpected = {1, 3, 3, 4, 12, 21, 30, 50, 60};
        new CountingSort().sort(arrayInput, 60);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testCountingSortEmptyKotlin() {
        int[] arrayInput = {};
        int[] arrayExpected = {};
        new sortingalgorithms.countingsort.kotlin.CountingSort().sort(arrayInput, 0);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testCountingSortWithDataKotlin() {
        int[] arrayInput = {30, 4, 3, 50, 60, 12, 1, 21, 3};
        int[] arrayExpected = {1, 3, 3, 4, 12, 21, 30, 50, 60};
        new sortingalgorithms.countingsort.kotlin.CountingSort().sort(arrayInput, 60);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }
}

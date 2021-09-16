package sortingalgorithms.quicksort;

import org.junit.Assert;
import org.junit.Test;
import sortingalgorithms.quicksort.java.QuickSort;

public class QuickSortTest {
    @Test
    public void testQuickSortEmptyJava() {
        int[] arrayInput = {};
        int[] arrayExpected = {};
        new QuickSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testCountingSortWithDataJava() {
        int[] arrayInput = {30, 4, 3, 50, 60, 12, 1, 21, 3};
        int[] arrayExpected = {1, 3, 3, 4, 12, 21, 30, 50, 60};
        new QuickSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }
}

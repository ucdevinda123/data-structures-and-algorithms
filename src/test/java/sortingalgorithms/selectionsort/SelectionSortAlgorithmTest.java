package sortingalgorithms.selectionsort;

import org.junit.Assert;
import org.junit.Test;
import sortingalgorithms.bubblesort.kotlin.BubbleSort;
import sortingalgorithms.selectionsort.kotlin.SelectionSort;

public class SelectionSortAlgorithmTest {

    @Test
    public void testSelectionSortWithEmptyInputJava() {
        int[] arrayInput = {};
        int[] arrayExpected = {};
        new sortingalgorithms.selectionsort.java.SelectionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testSelectionSortWithEmptyInputKotlin() {
        int[] arrayInput = {};
        int[] arrayExpected = {};
        new SelectionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testSelectionSortWithArraySortedDescendingOrderJava() {
        int[] arrayInput = {4, 3, 2, 1, 0};
        int[] arrayExpected = {0, 1, 2, 3, 4};
        new sortingalgorithms.selectionsort.java.SelectionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testSelectionSortWithArraySortedDescendingOrderKotlin() {
        int[] arrayInput = {4, 3, 2, 1, 0};
        int[] arrayExpected = {0, 1, 2, 3, 4};
        new SelectionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }


    @Test
    public void testSelectionSortWithArrayAlreadySortedJava() {
        int[] arrayInput = {0, 1, 2, 3, 4};
        int[] arrayExpected = {0, 1, 2, 3, 4};
        new sortingalgorithms.selectionsort.java.SelectionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testSelectionSortWithArrayAlreadySortedKotlin() {
        int[] arrayInput = {0, 1, 2, 3, 4};
        int[] arrayExpected = {0, 1, 2, 3, 4};
        new SelectionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }
}
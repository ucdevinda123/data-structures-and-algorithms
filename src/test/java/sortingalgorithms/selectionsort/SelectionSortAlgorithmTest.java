package sortingalgorithms.selectionsort;

import org.junit.Assert;
import org.junit.Test;
import sortingalgorithms.bubblesort.kotlin.BubbleSort;
import sortingalgorithms.selectionsort.kotlin.SelectionSort;

public class SelectionSortAlgorithmTest {

    @Test
    public void testSelectionSortWithEmptyInputJava() {
        Integer[] arrayInput = {};
        Integer[] arrayExpected = {};
        new sortingalgorithms.selectionsort.java.SelectionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testSelectionSortWithEmptyInputKotlin() {
        Integer[] arrayInput = {};
        Integer[] arrayExpected = {};
        new SelectionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testSelectionSortWithArraySortedDescendingOrderJava() {
        Integer[] arrayInput = {4, 3, 2, 1, 0};
        Integer[] arrayExpected = {0, 1, 2, 3, 4};
        new sortingalgorithms.selectionsort.java.SelectionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testSelectionSortWithArraySortedDescendingOrderKotlin() {
        Integer[] arrayInput = {4, 3, 2, 1, 0};
        Integer[] arrayExpected = {0, 1, 2, 3, 4};
        new SelectionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }


    @Test
    public void testSelectionSortWithArrayAlreadySortedJava() {
        Integer[] arrayInput = {0, 1, 2, 3, 4};
        Integer[] arrayExpected = {0, 1, 2, 3, 4};
        new sortingalgorithms.selectionsort.java.SelectionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testSelectionSortWithArrayAlreadySortedKotlin() {
        Integer[] arrayInput = {0, 1, 2, 3, 4};
        Integer[] arrayExpected = {0, 1, 2, 3, 4};
        new SelectionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }
}
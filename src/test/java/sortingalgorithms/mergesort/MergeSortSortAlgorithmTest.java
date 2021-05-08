package sortingalgorithms.mergesort;

import org.junit.Assert;
import org.junit.Test;
import sortingalgorithms.insertionsort.kotlin.InsertionSort;
import sortingalgorithms.mergesort.kotlin.MergeSort;

public class MergeSortSortAlgorithmTest {

    @Test
    public void testMergeSortWithEmptyInputJava() {
        Integer[] arrayInput = {};
        Integer[] arrayExpected = {};
        new sortingalgorithms.mergesort.java.MergeSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testMergeSortWithEmptyInputKotlin() {
        Integer[] arrayInput = {};
        Integer[] arrayExpected = {};
        new MergeSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testMergeSortWithArraySortedDescendingOrderJava() {
        Integer[] arrayInput = {4, 3, 2, 1, 0};
        Integer[] arrayExpected = {0, 1, 2, 3, 4};
        new sortingalgorithms.mergesort.java.MergeSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testMergeSortWithArraySortedDescendingOrderKotlin() {
        Integer[] arrayInput = {4, 3, 2, 1, 0};
        Integer[] arrayExpected = {0, 1, 2, 3, 4};
        new MergeSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }


    @Test
    public void testMergeSortWithArrayAlreadySortedJava() {
        Integer[] arrayInput = {0, 1, 2, 3, 4};
        Integer[] arrayExpected = {0, 1, 2, 3, 4};
        new sortingalgorithms.mergesort.java.MergeSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testMergeSortWithArrayAlreadySortedKotlin() {
        Integer[] arrayInput = {0, 1, 2, 3, 4};
        Integer[] arrayExpected = {0, 1, 2, 3, 4};
        new MergeSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }
}

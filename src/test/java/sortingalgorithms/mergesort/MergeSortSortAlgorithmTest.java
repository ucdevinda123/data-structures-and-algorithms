package sortingalgorithms.mergesort;

import org.junit.Assert;
import org.junit.Test;
import sortingalgorithms.insertionsort.kotlin.InsertionSort;
import sortingalgorithms.mergesort.kotlin.MergeSort;

public class MergeSortSortAlgorithmTest {

    @Test
    public void testMergeSortWithEmptyInputJava() {
        int[] arrayInput = {};
        int[] arrayExpected = {};
        new sortingalgorithms.mergesort.java.MergeSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testMergeSortWithEmptyInputKotlin() {
        int[] arrayInput = {};
        int[] arrayExpected = {};
        new MergeSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testMergeSortWithArraySortedDescendingOrderJava() {
        int[] arrayInput = {4, 3, 2, 1, 0};
        int[] arrayExpected = {0, 1, 2, 3, 4};
        new sortingalgorithms.mergesort.java.MergeSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testMergeSortWithArraySortedDescendingOrderKotlin() {
        int[] arrayInput = {4, 3, 2, 1, 0};
        int[] arrayExpected = {0, 1, 2, 3, 4};
        new MergeSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }


    @Test
    public void testMergeSortWithArrayAlreadySortedJava() {
        int[] arrayInput = {0, 1, 2, 3, 4};
        int[] arrayExpected = {0, 1, 2, 3, 4};
        new sortingalgorithms.mergesort.java.MergeSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testMergeSortWithArrayAlreadySortedKotlin() {
        int[] arrayInput = {0, 1, 2, 3, 4};
        int[] arrayExpected = {0, 1, 2, 3, 4};
        new MergeSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }
}

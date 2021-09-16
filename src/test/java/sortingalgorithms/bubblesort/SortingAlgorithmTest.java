package sortingalgorithms.bubblesort;

import org.junit.Assert;
import org.junit.Test;
import sortingalgorithms.bubblesort.kotlin.BubbleSort;

public class SortingAlgorithmTest {

    @Test
    public void testBubbleSortWithEmptyInputJava() {
        int[] arrayInput = {};
        int[] arrayExpected = {};
        new sortingalgorithms.bubblesort.java.BubbleSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testBubbleSortWithEmptyInputKotlin() {
        int[] arrayInput = {};
        int[] arrayExpected = {};
        new BubbleSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testBubbleSortWithArraySortedDescendingOrderJava() {
        int[] arrayInput = {4, 3, 2, 1, 0};
        int[] arrayExpected = {0, 1, 2, 3, 4};
        new sortingalgorithms.bubblesort.java.BubbleSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testBubbleSortWithArraySortedDescendingOrderKotlin() {
        int[] arrayInput = {4, 3, 2, 1, 0};
        int[] arrayExpected = {0, 1, 2, 3, 4};
        new BubbleSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }


    @Test
    public void testBubbleSortWithArrayAlreadySortedJava() {
        int[] arrayInput = {0, 1, 2, 3, 4};
        int[] arrayExpected = {0, 1, 2, 3, 4};
        new sortingalgorithms.bubblesort.java.BubbleSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testBubbleSortWithArrayAlreadySortedKotlin() {
        int[] arrayInput = {0, 1, 2, 3, 4};
        int[] arrayExpected = {0, 1, 2, 3, 4};
        new BubbleSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }
}

package sortingalgorithms.bubblesort;

import org.junit.Assert;
import org.junit.Test;
import sortingalgorithms.bubblesort.kotlin.BubbleSort;

public class SortingAlgorithmTest {

    @Test
    public void testBubbleSortWithEmptyInputJava() {
        Integer[] arrayInput = {};
        Integer[] arrayExpected = {};
        new sortingalgorithms.bubblesort.java.BubbleSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testBubbleSortWithEmptyInputKotlin() {
        Integer[] arrayInput = {};
        Integer[] arrayExpected = {};
        new BubbleSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testBubbleSortWithArraySortedDescendingOrderJava() {
        Integer[] arrayInput = {4, 3, 2, 1, 0};
        Integer[] arrayExpected = {0, 1, 2, 3, 4};
        new sortingalgorithms.bubblesort.java.BubbleSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testBubbleSortWithArraySortedDescendingOrderKotlin() {
        Integer[] arrayInput = {4, 3, 2, 1, 0};
        Integer[] arrayExpected = {0, 1, 2, 3, 4};
        new BubbleSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }


    @Test
    public void testBubbleSortWithArrayAlreadySortedJava() {
        Integer[] arrayInput = {0, 1, 2, 3, 4};
        Integer[] arrayExpected = {0, 1, 2, 3, 4};
        new sortingalgorithms.bubblesort.java.BubbleSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testBubbleSortWithArrayAlreadySortedKotlin() {
        Integer[] arrayInput = {0, 1, 2, 3, 4};
        Integer[] arrayExpected = {0, 1, 2, 3, 4};
        new BubbleSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }
}

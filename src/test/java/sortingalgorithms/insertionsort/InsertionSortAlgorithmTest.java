package sortingalgorithms.insertionsort;

import org.junit.Assert;
import org.junit.Test;
import sortingalgorithms.insertionsort.kotlin.InsertionSort;

public class InsertionSortAlgorithmTest {

    @Test
    public void testInsertionSortWithEmptyInputJava() {
        Integer[] arrayInput = {};
        Integer[] arrayExpected = {};
        new sortingalgorithms.insertionsort.java.InsertionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testInsertionSortWithEmptyInputKotlin() {
        Integer[] arrayInput = {};
        Integer[] arrayExpected = {};
        new InsertionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testInsertionSortWithArraySortedDescendingOrderJava() {
        Integer[] arrayInput = {4, 3, 2, 1, 0};
        Integer[] arrayExpected = {0, 1, 2, 3, 4};
        new sortingalgorithms.insertionsort.java.InsertionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testInsertionSortWithArraySortedDescendingOrderKotlin() {
        Integer[] arrayInput = {4, 3, 2, 1, 0};
        Integer[] arrayExpected = {0, 1, 2, 3, 4};
        new InsertionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }


    @Test
    public void testInsertionSortWithArrayAlreadySortedJava() {
        Integer[] arrayInput = {0, 1, 2, 3, 4};
        Integer[] arrayExpected = {0, 1, 2, 3, 4};
        new sortingalgorithms.insertionsort.java.InsertionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }

    @Test
    public void testInsertionSortWithArrayAlreadySortedKotlin() {
        Integer[] arrayInput = {0, 1, 2, 3, 4};
        Integer[] arrayExpected = {0, 1, 2, 3, 4};
        new InsertionSort().sort(arrayInput);
        Assert.assertArrayEquals(arrayInput, arrayExpected);
    }
}

/*How it works
i.e  [4,3,5] for this Example it's 0(1) (In this case in the first iteration it will be sorted,
             since next iterations won't satisfy the while loop condition (Already in the right place)
1st -> [4 ,4, 5]  current = 3
        [3,4,5]

        O(N) to O(N^2)
*/
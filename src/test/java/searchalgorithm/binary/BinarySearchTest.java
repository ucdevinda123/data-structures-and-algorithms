package searchalgorithm.binary;

import org.junit.Assert;
import org.junit.Test;
import searchalgorithms.binarysearch.java.BinarySearchIteration;
import searchalgorithms.binarysearch.java.BinarySearchRecursion;

public class BinarySearchTest {

    @Test
    public void testBinarySearchRecursionJava1() {
        int[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 3;
        int result = new BinarySearchRecursion().search(inputArray,targetValue);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testLinearSearchRecursionKotlin1() {
        int[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 3;
        int result = new searchalgorithms.binarysearch.kotlin.BinarySearchRecursion().search(inputArray,targetValue);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testLinearSearchIterationKotlin1() {
        int[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 3;
        int result = new searchalgorithms.binarysearch.kotlin.BinarySearchIteration().search(inputArray,targetValue);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testBinarySearchIterationJava1() {
        int[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 3;
        int result = new BinarySearchIteration().search(inputArray,targetValue);
        Assert.assertEquals(3, result);
    }


    @Test
    public void testBinarySearchRecursionJava2() {
        int[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 30;
        int result = new BinarySearchRecursion().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testBinarySearchIterationJava2() {
        int[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 30;
        int result = new BinarySearchIteration().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testLinearSearchRecursionKotlin2() {
        int[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 30;
        int result = new searchalgorithms.binarysearch.kotlin.BinarySearchRecursion().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testLinearSearchIterationKotlin2() {
        int[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 30;
        int result = new searchalgorithms.binarysearch.kotlin.BinarySearchIteration().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testBinarySearchRecursionJava3() {
        int[] inputArray = {};
        int targetValue = 3;
        int result = new BinarySearchRecursion().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testBinarySearchIterationJava3() {
        int[] inputArray = {};
        int targetValue = 3;
        int result = new BinarySearchIteration().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testLinearSearchRecursionKotlin3() {
        int[] inputArray = {};
        int targetValue = 3;
        int result = new searchalgorithms.binarysearch.kotlin.BinarySearchRecursion().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testLinearSearchIterationKotlin3() {
        int[] inputArray = {};
        int targetValue = 3;
        int result = new searchalgorithms.binarysearch.kotlin.BinarySearchIteration().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }
}

package searchalgorithm.binary;

import org.junit.Assert;
import org.junit.Test;
import searchalgorithms.binarysearch.java.BinarySearchRecursion;

public class BinarySearchTest {

    @Test
    public void testBinarySearchRecursionJava1() {
        Integer[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 3;
        int result = new BinarySearchRecursion().search(inputArray,targetValue);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testLinearSearchRecursionKotlin1() {
        Integer[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 3;
        int result = new searchalgorithms.binarysearch.kotlin.BinarySearchRecursion().search(inputArray,targetValue);
        Assert.assertEquals(3, result);
    }


    @Test
    public void testBinarySearchRecursionJava2() {
        Integer[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 30;
        int result = new BinarySearchRecursion().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testLinearSearchRecursionKotlin2() {
        Integer[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 30;
        int result = new searchalgorithms.binarysearch.kotlin.BinarySearchRecursion().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testBinarySearchRecursionJava3() {
        Integer[] inputArray = {};
        int targetValue = 3;
        int result = new BinarySearchRecursion().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testLinearSearchRecursionKotlin3() {
        Integer[] inputArray = {};
        int targetValue = 3;
        int result = new searchalgorithms.binarysearch.kotlin.BinarySearchRecursion().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }
}

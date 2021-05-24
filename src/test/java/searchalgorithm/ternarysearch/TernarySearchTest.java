package searchalgorithm.ternarysearch;

import org.junit.Assert;
import org.junit.Test;
import searchalgorithms.ternarysearch.java.TernarySearchRecursion;

public class TernarySearchTest {

    @Test
    public void testTernarySearchRecursionJava1() {
        Integer[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 3;
        int result = new TernarySearchRecursion().search(inputArray, targetValue);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testTernarySearchRecursionKotlin1() {
        Integer[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 3;
        int result = new searchalgorithms.ternarysearch.kotlin.TernarySearchRecursion().search(inputArray, targetValue);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testTernarySearchRecursionJava2() {
        Integer[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 30;
        int result = new TernarySearchRecursion().search(inputArray, targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testLinearSearchRecursionKotlin2() {
        Integer[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 30;
        int result = new searchalgorithms.ternarysearch.kotlin.TernarySearchRecursion().search(inputArray, targetValue);
        Assert.assertEquals(-1, result);
    }


    @Test
    public void testTernarySearchRecursionJava3() {
        Integer[] inputArray = {};
        int targetValue = 3;
        int result = new TernarySearchRecursion().search(inputArray, targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testLinearSearchRecursionKotlin3() {
        Integer[] inputArray = {};
        int targetValue = 3;
        int result = new searchalgorithms.ternarysearch.kotlin.TernarySearchRecursion().search(inputArray, targetValue);
        Assert.assertEquals(-1, result);
    }
}
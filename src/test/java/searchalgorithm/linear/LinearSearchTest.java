package searchalgorithm.linear;

import org.junit.Assert;
import org.junit.Test;
import searchalgorithms.linearsearch.java.LinearSearch;

public class LinearSearchTest {

    @Test
    public void testLinearSearchJava1() {
        int[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 3;
        int result = new LinearSearch().search(inputArray,targetValue);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testLinearSearchKotlin1() {
        int[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 3;
        int result = new searchalgorithms.linearsearch.kotlin.LinearSearch().search(inputArray,targetValue);
        Assert.assertEquals(3, result);
    }


    @Test
    public void testLinearSearchJava2() {
        int[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 30;
        int result = new LinearSearch().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testLinearSearchKotlin2() {
        int[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 30;
        int result = new searchalgorithms.linearsearch.kotlin.LinearSearch().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testLinearSearchJava3() {
        int[] inputArray = {};
        int targetValue = 3;
        int result = new LinearSearch().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testLinearSearchKotlin3() {
        int[] inputArray = {};
        int targetValue = 3;
        int result = new searchalgorithms.linearsearch.kotlin.LinearSearch().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }
}

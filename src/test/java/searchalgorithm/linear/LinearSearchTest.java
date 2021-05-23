package searchalgorithm.linear;

import org.junit.Assert;
import org.junit.Test;
import searchalgorithms.linearsearch.java.LinearSearch;

public class LinearSearchTest {

    @Test
    public void testLinearSearchJava1() {
        Integer[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 3;
        int result = new LinearSearch().search(inputArray,targetValue);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testLinearSearchKotlin1() {
        Integer[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 3;
        int result = new searchalgorithms.linearsearch.kotlin.LinearSearch().search(inputArray,targetValue);
        Assert.assertEquals(3, result);
    }


    @Test
    public void testLinearSearchJava2() {
        Integer[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 30;
        int result = new LinearSearch().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testLinearSearchKotlin2() {
        Integer[] inputArray = {0, 1, 2, 3, 4};
        int targetValue = 30;
        int result = new searchalgorithms.linearsearch.kotlin.LinearSearch().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testLinearSearchJava3() {
        Integer[] inputArray = {};
        int targetValue = 3;
        int result = new LinearSearch().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testLinearSearchKotlin3() {
        Integer[] inputArray = {};
        int targetValue = 3;
        int result = new searchalgorithms.linearsearch.kotlin.LinearSearch().search(inputArray,targetValue);
        Assert.assertEquals(-1, result);
    }
}

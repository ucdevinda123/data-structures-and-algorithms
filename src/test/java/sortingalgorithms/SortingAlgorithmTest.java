package sortingalgorithms;

import org.junit.Test;
import sortingalgorithms.kotlin.BubbleSort;

public class SortingAlgorithmTest {

    @Test public void testBubbleSortWithEmptyInput(){
        Integer[]  array = {5, 3, 0, 2, 4, 1, 0, 5, 2, 3, 1, 4};
        new BubbleSort().sort(array);
    }
}

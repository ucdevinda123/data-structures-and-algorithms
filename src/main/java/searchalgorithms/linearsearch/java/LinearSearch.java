package searchalgorithms.linearsearch.java;

import org.jetbrains.annotations.NotNull;
import searchalgorithms.SearchAlgorithm;

public class LinearSearch extends SearchAlgorithm {
    @Override
    public int search(@NotNull int[] inputArray, int target) {
        for (int i=0;i< inputArray.length;i++) {
             if(inputArray[i] == target) return i;
        }
        return -1;
    }
}

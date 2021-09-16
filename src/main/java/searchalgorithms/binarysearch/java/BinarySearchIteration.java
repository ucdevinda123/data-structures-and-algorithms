package searchalgorithms.binarysearch.java;

import org.jetbrains.annotations.NotNull;
import searchalgorithms.SearchAlgorithm;

public class BinarySearchIteration extends SearchAlgorithm {
    @Override
    public int search(@NotNull int[] inputArray, int target) {
        return binarySearchUsingIteration(inputArray, target, 0, inputArray.length - 1);
    }

    private int binarySearchUsingIteration(@NotNull int[] inputArray, int target, int left, int right) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (inputArray[middle] == target) return middle;
            if (target < inputArray[middle]) right = middle - 1;
            else left = middle + 1;
        }
        return -1;
    }
}

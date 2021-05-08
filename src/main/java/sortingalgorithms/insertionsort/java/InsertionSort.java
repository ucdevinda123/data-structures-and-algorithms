package sortingalgorithms.insertionsort.java;

import org.jetbrains.annotations.NotNull;
import sortingalgorithms.SortingAlgorithm;

public class InsertionSort extends SortingAlgorithm {
    @Override
    public void sort(@NotNull Integer[] input) {
        int length = input.length;
        for (int i = 1; i < length; i++) {
            int current = input[i];
            int j = i - 1;
            while (j >= 0 && input[j] > current) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = current;
        }
    }
}
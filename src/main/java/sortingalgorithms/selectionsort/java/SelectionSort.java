package sortingalgorithms.selectionsort.java;

import org.jetbrains.annotations.NotNull;
import sortingalgorithms.SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort extends SortingAlgorithm {
    @Override
    public void sort(@NotNull Integer[] input) {
        int length = input.length;
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i; j < length; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            swap(input, minIndex, i);
        }
        Arrays.toString(input);
    }
}
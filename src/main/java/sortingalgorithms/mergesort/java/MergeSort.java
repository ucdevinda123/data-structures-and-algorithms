package sortingalgorithms.mergesort.java;

import org.jetbrains.annotations.NotNull;
import sortingalgorithms.SortingAlgorithm;

public class MergeSort extends SortingAlgorithm {
    @Override
    public void sort(@NotNull int[] input) {
        int length = input.length;
        if (length < 2) return;
        int middle = length / 2;

        //1.Find the middle and divide the array O(log)
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        for (int i = 0; i < middle; i++) {
            leftArray[i] = input[i];
        }

        for (int j = middle; j < length; j++) {
            rightArray[j - middle] = input[j];
        }

        //2. Sort the both arrays
        sort(leftArray);
        sort(rightArray);

        //3. Final Step is to merge
        merge(leftArray, rightArray, input);
    }

    private void merge(int[] leftArray, int[] rightArray, int[] input) {
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                input[k++] = leftArray[i++];
            } else {
                input[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            input[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            input[k++] = rightArray[j++];
        }
    }
}
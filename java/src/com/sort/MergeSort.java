package com.sort;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] inputData = {13, 45, 232, 5, 3, 5, 1, 4, 5, 34, 44};
        mergeSort(inputData);
        System.out.println(Arrays.toString(inputData));
    }

    private static void mergeSort(int[] inputData) {
        int inputDataLength = inputData.length;
        if (inputDataLength < 2) return;
        int middle = inputDataLength / 2;

        //Divide
        //First we create the left Array
        int[] leftArray = new int[middle];
        for (int i = 0; i < middle; i++) {
            leftArray[i] = inputData[i];
        }

        //Then we create the right array
        int[] rightArray = new int[inputDataLength - middle];
        for (int i = middle; i < inputDataLength; i++) {
            //i - middle to make sure we get the right index
            rightArray[i - middle] = inputData[i];
        }

        // Divide further using recursion until we do not have any
        mergeSort(leftArray);
        mergeSort(rightArray);

        //Then we do the merge
        mergeArrayData(leftArray, rightArray, inputData);
    }

    private static void mergeArrayData(int[] leftArray, int[] rightArray, int[] inputData) {
        int i = 0, j = 0, k = 0;
        int leftArrayLength = leftArray.length;
        int rightArrayLength = rightArray.length;
        while (i < leftArrayLength && j < rightArrayLength) {
            if (leftArray[i] <= rightArray[j]) {
                inputData[k++] = leftArray[i++];
            } else {
                inputData[k++] = rightArray[j++];
            }
        }

        //We might have a case where left and right array lengths are not same
        while (i < leftArrayLength) {
            inputData[k++] = leftArray[i++];
        }

        while (j < rightArrayLength) {
            inputData[k++] = rightArray[j++];
        }
    }
}
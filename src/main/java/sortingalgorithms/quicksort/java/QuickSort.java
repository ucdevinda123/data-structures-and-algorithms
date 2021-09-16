package sortingalgorithms.quicksort.java;

import org.jetbrains.annotations.NotNull;
import sortingalgorithms.SortingAlgorithm;

public class QuickSort  extends  SortingAlgorithm {

    public void sort(@NotNull int[] input) {
        performQuickSort(input,0,input.length-1);
    }

    private void performQuickSort(int[] inputArray, int start, int end){
        if(start >= end) return;
        int pivotIndexAfterMoved = findPivotIndexAfterItMoved(inputArray,start,end);
        performQuickSort(inputArray,start, pivotIndexAfterMoved - 1);
        performQuickSort(inputArray,pivotIndexAfterMoved + 1, end);
    }

    private int findPivotIndexAfterItMoved(int[] inputArray, int start, int end) {
         Integer pivot = inputArray[end];
        int boundary = start -1;
         for(int i= start;i<=end;i++){
             if(inputArray[i] <= pivot){
                 int temp = inputArray[++boundary];
                 inputArray[boundary] = inputArray[i];
                 inputArray[i] = temp;
             }
         }
        return boundary;
    }

}

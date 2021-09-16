package sortingalgorithms.bubblesort.java;

import org.jetbrains.annotations.NotNull;
import sortingalgorithms.SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort extends SortingAlgorithm {
    @Override
    public void sort(@NotNull int[] input) {
        int length = input.length;
        boolean isSorted;
        for (int i = 0;i< length;i++){
            isSorted = true;
            for (int j = 1;j< length -i;j++){
                if(input[j] < input[j-1]){
                    swap(input,j,j-1);
                    isSorted = false;
                }
            }
            if(isSorted) {
                Arrays.toString(input);
                return;
            }
        }
    }
}

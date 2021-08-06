package sortingalgorithms.countingsort.java;
import org.jetbrains.annotations.NotNull;

public class CountingSort {
    public void sort(@NotNull Integer[] input, int max) {
        int[] countArray = new int[max+1];
        for (int num : input) {
            countArray[num]++;
        }

        int k = 0;
        int countArrayLength = countArray.length;
        for (int i = 0; i < countArrayLength; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                input[k++] = i;
            }
        }
    }
}
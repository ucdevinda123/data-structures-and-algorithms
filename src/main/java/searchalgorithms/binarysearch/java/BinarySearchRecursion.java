package searchalgorithms.binarysearch.java;

import org.jetbrains.annotations.NotNull;
import searchalgorithms.SearchAlgorithm;

public class BinarySearchRecursion extends SearchAlgorithm {
    @Override
    public int search(@NotNull int[] inputArray, int target) {
        return binarySearchUsingRecursion(inputArray,target,0,inputArray.length -1);
    }

    private int binarySearchUsingRecursion(@NotNull int[] inputArray, int target,int left, int right){
        int middle = (left + right) / 2;
        if(left > right) return -1;
        if(inputArray[middle] == target) return middle;
        if(target < inputArray[middle]){
            return binarySearchUsingRecursion(inputArray,target,left,middle -1);
        }
        return binarySearchUsingRecursion(inputArray,target,middle+1,right);
    }
}

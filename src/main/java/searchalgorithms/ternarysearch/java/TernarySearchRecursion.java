package searchalgorithms.ternarysearch.java;

import org.jetbrains.annotations.NotNull;
import searchalgorithms.SearchAlgorithm;

public class TernarySearchRecursion extends SearchAlgorithm {


    @Override
    public int search(@NotNull Integer[] inputArray, int target) {
        return binarySearchUsingRecursion(inputArray,target,0,inputArray.length -1);
    }

    private int binarySearchUsingRecursion(@NotNull Integer[] inputArray, int target,int left, int right){
        if(left > right) return -1;
        int blockSize = (right - left) / 3;
        int m1 = left + blockSize;
        int m2 = right - blockSize;

        if(inputArray[m1] == target) return  m1;
        if(inputArray[m2] == target) return  m2;
        if( target < inputArray[m1]){
            return  binarySearchUsingRecursion(inputArray,target,left,m1 -1);
        }else if(target > inputArray[m2]){
            return  binarySearchUsingRecursion(inputArray,target,m2 + 1,right );
        }else{
            return  binarySearchUsingRecursion(inputArray,target,m1 + 1,m2 -1);
        }
    }
}

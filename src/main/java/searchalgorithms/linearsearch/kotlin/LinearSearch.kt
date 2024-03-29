package searchalgorithms.linearsearch.kotlin

import searchalgorithms.SearchAlgorithm

class LinearSearch : SearchAlgorithm() {
    override fun search(inputArray: IntArray, target: Int): Int {
        for(i in inputArray.indices){
            if(inputArray[i] == target) return i;
        }
        return -1;
    }
}
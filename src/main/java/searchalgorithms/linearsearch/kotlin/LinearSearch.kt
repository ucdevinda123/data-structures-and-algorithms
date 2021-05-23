package searchalgorithms.linearsearch.kotlin

import searchalgorithms.SearchAlgorithm

class LinearSearch : SearchAlgorithm() {
    override fun search(inputArray: Array<Int>, target: Int): Int {
        for(i in inputArray.indices){
            if(inputArray[i] == target) return i;
        }
        return -1;
    }
}
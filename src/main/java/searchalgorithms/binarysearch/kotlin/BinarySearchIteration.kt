package searchalgorithms.binarysearch.kotlin

import searchalgorithms.SearchAlgorithm

class BinarySearchIteration : SearchAlgorithm() {
    override fun search(inputArray: Array<Int>, target: Int): Int {
      return binarySearchUsingIteration(inputArray,target,0,inputArray.size-1)
    }

    private fun binarySearchUsingIteration(inputArray: Array<Int>, target: Int, left: Int, right: Int): Int {
        var left = left
        var right = right
        while (left <= right) {
            val middle = (left + right) / 2
            if (inputArray[middle] == target) return middle
            if (target < inputArray[middle]) right = middle - 1 else left = middle + 1
        }
        return -1
    }
    }
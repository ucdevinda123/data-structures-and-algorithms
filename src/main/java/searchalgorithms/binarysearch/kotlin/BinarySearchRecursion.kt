package searchalgorithms.binarysearch.kotlin

import searchalgorithms.SearchAlgorithm

class BinarySearchRecursion : SearchAlgorithm() {
    override fun search(inputArray: Array<Int>, target: Int): Int {
        return binarySearchUsingRecursion(inputArray, target, 0, inputArray.size - 1)
    }

    private fun binarySearchUsingRecursion(inputArray: Array<Int>, target: Int, left: Int, right: Int): Int {
        var middle = (left + right) / 2
        if (left > right) return -1
        if (inputArray[middle] == target) return middle
        if (target < inputArray[middle]) return binarySearchUsingRecursion(inputArray, target, left, middle - 1);

        return binarySearchUsingRecursion(inputArray, target, middle + 1, right);
    }
}
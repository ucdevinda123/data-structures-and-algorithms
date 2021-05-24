package searchalgorithms.ternarysearch.kotlin

import searchalgorithms.SearchAlgorithm

class TernarySearchRecursion : SearchAlgorithm() {
    override fun search(inputArray: Array<Int>, target: Int): Int {
        return binarySearchUsingRecursion(inputArray, target, 0, inputArray.size - 1)
    }

    private fun binarySearchUsingRecursion(inputArray: Array<Int>, target: Int, left: Int, right: Int): Int {
        var blockSize = (right - left) / 3
        if (left > right) return -1
        var m1 = left + blockSize
        var m2 = right - blockSize

        if (inputArray[m1] == target) return m1
        if (inputArray[m2] == target) return m2
        if (target < inputArray[m1]) {
            return binarySearchUsingRecursion(inputArray, target, left, right - 1)
        } else if (target > inputArray[m2]) {
            return binarySearchUsingRecursion(inputArray, target, m2 + 1, right)
        } else {
            return binarySearchUsingRecursion(inputArray, target, m1 + 1, m2 - 1)
        }
    }
}
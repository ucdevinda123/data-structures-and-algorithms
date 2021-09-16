package sortingalgorithms.insertionsort.kotlin

import sortingalgorithms.SortingAlgorithm

class InsertionSort : SortingAlgorithm() {
    override fun sort(input: IntArray) {
        var length = input.size
        for (i in 1 until length) {
            var current = input[i]
            var j = i - 1
            while (j >= 0 && input[j] > current) {
                input[j + 1] = input[j]
                j--
            }
            input[j + 1] = current
        }
    }
}
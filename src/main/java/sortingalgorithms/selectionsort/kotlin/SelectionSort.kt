package sortingalgorithms.selectionsort.kotlin

import sortingalgorithms.SortingAlgorithm

class SelectionSort : SortingAlgorithm() {
    override fun sort(input: IntArray) {
        val length = input.size
        for (i in 0 until length) {
            var minIndex = i
            for (j in i until length) {
                if (input[j] < input[minIndex]) {
                    minIndex = j
                }
            }
            swap(input, minIndex, i)
        }
    }
}
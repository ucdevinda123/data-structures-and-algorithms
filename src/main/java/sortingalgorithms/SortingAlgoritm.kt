package sortingalgorithms

open abstract class SortingAlgorithm {
    open abstract fun sort(input: IntArray)
    open fun swap(input: IntArray, indexOne: Int, indexTwo: Int) {
        var temp = input[indexOne]
        input[indexOne] = input[indexTwo]
        input[indexTwo] = temp
    }
}
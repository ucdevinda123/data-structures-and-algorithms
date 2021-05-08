package sortingalgorithms

open abstract class SortingAlgorithm {
    open abstract fun sort(input: Array<Int>)
    open fun swap(input: Array<Int>, indexOne: Int, indexTwo: Int) {
        var temp = input[indexOne]
        input[indexOne] = input[indexTwo]
        input[indexTwo] = temp
    }
}
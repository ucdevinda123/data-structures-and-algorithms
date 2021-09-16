package sortingalgorithms.countingsort.kotlin

class CountingSort {

    fun sort(inputData: IntArray, max: Int) {
        var countingArray = Array(max + 1) {0}
        for (number in inputData) {
            countingArray[number]++
        }

        var k = 0
        for (i in countingArray.indices) {
            for (j in 0 until countingArray[i]) {
                inputData[k++] = i
            }
        }
    }
}
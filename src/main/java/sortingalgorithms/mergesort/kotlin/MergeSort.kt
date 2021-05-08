package sortingalgorithms.mergesort.kotlin

import sortingalgorithms.SortingAlgorithm

class MergeSort : SortingAlgorithm() {
    override fun sort(input: Array<Int>) {
        val length = input.size
        if (length < 2) return //Base condition
        //1.Find the middle and divide the array O(log)
        var middle = length / 2
        var leftArray = Array(middle) { 0 } // 0 to middle
        var rightArray = Array(length - middle) { 0 } // middle to end of the array (length)

        for (i in 0 until middle) {
            leftArray[i] = input[i]
        }

        for (j in middle until length) {
            //j - middle : make sure to get the right index
            rightArray[j - middle] = input[j]
        }

        //2. We sort both the arrays Recursively
        sort(leftArray)
        sort(rightArray)

        //3. Last step let's merge it
        merge(leftArray, rightArray, input)
    }

    private fun merge(leftArray: Array<Int>, rightArray: Array<Int>, inputData: Array<Int>) {
        var i = 0
        var j = 0
        var k = 0
        // when both left and right array sizes are equal
        while (i < leftArray.size && j < rightArray.size) {
            if (leftArray[i] <= rightArray[j]) {
                inputData[k++] = leftArray[i++]
            } else {
                inputData[k++] = rightArray[j++]
            }
        }

        while (i < leftArray.size) {
            inputData[k++] = leftArray[i++]
        }

        while (j < rightArray.size) {
            inputData[k++] = rightArray[j++]
        }
    }
}
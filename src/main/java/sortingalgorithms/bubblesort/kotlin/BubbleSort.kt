package sortingalgorithms.bubblesort.kotlin

import sortingalgorithms.SortingAlgorithm
import java.util.*

class BubbleSort  : SortingAlgorithm(){
    override fun sort(input: Array<Int>) {
      val length = input.size
        var isSorted : Boolean
        for(i in 0 until length){
            isSorted = true
            for(j in 1 until  length -i){
                if(input[j] < input[j-1]){
                    swap(input,j,j-1)
                    isSorted = false
                }
            }
            if(isSorted){
                print(Arrays.toString(input))
                return
            }
        }
    }
}
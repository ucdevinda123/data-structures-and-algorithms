# data-structures-and-algorithms
various data structures and algorithms and interview questions
Implementations are in both **Kotlin** and **Java**

### 1.)Sorting Algorithms
- **Bubble Sort**  
     * [BubbleSort : Java](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/sortingalgorithms/bubblesort/java/BubbleSort.java)   
     * [BubbleSort : Kotlin](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/sortingalgorithms/bubblesort/kotlin/BubbleSort.kt)  
     * [Test Case](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/test/java/sortingalgorithms/bubblesort/SortingAlgorithmTest.java)                     
                      
                        O(1) ~ O(N^2)
- **Selection Sort**   
     * [SelectionSort : Java](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/sortingalgorithms/selectionsort/java/SelectionSort.java)   
     * [SelectionSort : Kotlin](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/sortingalgorithms/selectionsort/kotlin/SelectionSort.kt)  
     * [Test Case](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/test/java/sortingalgorithms/selectionsort/SelectionSortAlgorithmTest.java)     
                       
                        O(N) ~ O(N^2)
- **Insertion Sort**     
     * [InsertionSort : Java](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/sortingalgorithms/insertionsort/java/InsertionSort.java)   
     * [InsertionSort : Kotlin](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/sortingalgorithms/insertionsort/kotlin/InsertionSort.kt)  
     * [Test Case](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/test/java/sortingalgorithms/insertionsort/InsertionSortAlgorithmTest.java)     
                                        
                        O(1) ~ O(N^2)
- **Merge Sort**     
     * [MergeSort : Java](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/sortingalgorithms/mergesort/java/MergeSort.java)   
     * [MergeSort : Kotlin](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/sortingalgorithms/mergesort/kotlin/MergeSort.kt)  
     * [Test Case](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/test/java/sortingalgorithms/mergesort/MergeSortSortAlgorithmTest.java)     
                                 
                     Divide :  O(log n)
                     Merge  :  O(n) 
                     O(n log n) 
                     
- **Quick Sort**  - Todo

- **Bucket Sort**  - Todo 

- **Counting Sort**  - Todo
                     
### 2.)Searching Algorithms

- **Linear Search**  
     * [Linear Search : Java](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/searchalgorithms/linearsearch/java/LinearSearch.java)   
     * [Linear Search : Kotlin](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/searchalgorithms/linearsearch/kotlin/LinearSearch.kt)  
     * [Test Case](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/test/java/searchalgorithm/linear/LinearSearchTest.java)     
         
                    O(N)  
                    
- **Binary Search**  
                    
                     Using Recursion     
                                    Time : O(log2 n)
                                    Storage : O(n)  // since it uses stack for recusion calls
                                    
                     Using Iteration
                                   Time : O(log2 n)  
                                   Storage : O(1)
                      Prefer Recussion apporach :)  
                                 
- **Ternary Search**  
    * [Ternary Search : Java](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/searchalgorithms/ternarysearch/java/TernarySearchRecursion.java)   
    * [Ternary Search : Kotlin](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/searchalgorithms/ternarysearch/kotlin/TernarySearchRecursion.kt)  
    * [Test Case](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/test/java/searchalgorithm/ternarysearch/TernarySearchTest.java)     
              
                     Using Recursion     
                                  Time : O(log3 n)   
  
  
                                 
### 3.)Data Structures Implementation
- **Hash Map** - Implemented using Chaining method to avoid collation  
   * [CustomHashTable : Java](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/datastructures/hashtable/java/CustomHashTable.java)
   * [CustomHashTable : Kotlin](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/datastructures/hashtable/kotlin/CustomHashTable.kt)
   *  [Test Case](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/test/java/datastructures/TestHashTable.java)  
   
- **Stack** - Implementation for the Stack (LIFO)
   * [CustomStack : Java](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/datastructures/stack/java/CustomStack.java)
   * [CustomStack : Kotlin](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/datastructures/stack/kotlin/CustomStack.kt)
   *  [Test Case](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/test/java/datastructures/TestStack.java) 
   
- **Queue** - Implementation for the Queue (FIFO)
      * [Queue (Circular Array) : Java](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/datastructures/queue/java/CustomQueueCircularArray.java)
      * [Queue (Circular Array) : Kotlin](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/datastructures/queue/kotlin/CustomQueueCircularArray.kt)
      *  [Test Case](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/test/java/datastructures/TestQueue.java)                                                                                                    
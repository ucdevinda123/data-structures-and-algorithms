# data-structures-and-algorithms [![CodeFactor](https://www.codefactor.io/repository/github/ucdevinda123/data-structures-and-algorithms/badge)](https://www.codefactor.io/repository/github/ucdevinda123/data-structures-and-algorithms)
various data structures and algorithms and interview questions

**![Kotlin](https://img.shields.io/badge/kotlin-%230095D5.svg?style=for-the-badge&logo=kotlin&logoColor=white)**   **![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)**  **![Python](https://img.shields.io/badge/python-%2314354C.svg?style=for-the-badge&logo=python&logoColor=white)**

### 1.)Sorting Algorithms
- **Bubble Sort**  
     * [BubbleSort : Java](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/sortingalgorithms/bubblesort/java/BubbleSort.java)   
     * [BubbleSort : Kotlin](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/sortingalgorithms/bubblesort/kotlin/BubbleSort.kt)  
     * [BubbleSort : Python](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/sortingalgorithms/bubblesort/python/BubbleSort.py)      
     * [Test Case](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/test/java/sortingalgorithms/bubblesort/SortingAlgorithmTest.java)                     
                      
                        O(1) ~ O(N^2)
- **Selection Sort**   
     * [SelectionSort : Java](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/sortingalgorithms/selectionsort/java/SelectionSort.java)   
     * [SelectionSort : Kotlin](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/sortingalgorithms/selectionsort/kotlin/SelectionSort.kt)  
     * [SelectionSort : Python](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/sortingalgorithms/selectionsort/python/SelectionSort.py)  
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
                     
- **Quick Sort**  - Quick sort is a highly efficient sorting algorithm and is based on partitioning of array of data into smaller arrays. ... Quicksort partitions an array and then calls itself recursively twice to sort the two resulting sub arrays.

   * [Quick Sort : Java](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/sortingalgorithms/quicksort/java/QuickSort.java)   
   * [Counting Sort : Kotlin] - todo;
   * [Test Case](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/test/java/sortingalgorithms/quicksort/QuickSortTest.java)     
    

- **Bucket Sort**  - Todo 

- **Counting Sort**  - 
     Unlike above comparision based algorithms, Counting sort is a sorting technique based on keys between a specific range.   
 
   * [Counting Sort : Java](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/sortingalgorithms/countingsort/java/CountingSort.java)   
   * [Counting Sort : Kotlin](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/sortingalgorithms/countingsort/kotlin/CountingSort.kt)  
   * [Test Case](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/test/java/sortingalgorithms/countingsort/CountingSortTest.java)     
       
                 Best Case :  O(k) where K is the max 
                 Worst Case  :  O(n) 
                 Overall  O(n + k ) -> O(n)                     
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
    * [Queue (With Two Stacks) : Java](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/datastructures/queue/java/QueueWithTwoStacks.java)
    * [Queue (With Two Stacks) : Kotlin](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/datastructures/queue/kotlin/QueueWithTwoStacks.kt)
                 
         * [leetcode 232](https://leetcode.com/problems/implement-queue-using-stacks/)  
         
               
             enqueue(item : T) - 0(1)
             
             peek and pop O(N) -
              
              Since we have to move items from primary stack to the other     
                                         
    
   *  [Test Case](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/test/java/datastructures/TestQueue.java)   
    
- **Dynamic Array** - Implementation for the Array List (Dynamic Array)
    * [Dynamic Array : Java](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/datastructures/array/java/CustomArray.java)
    *  [Test Case](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/test/java/datastructures/TestArray.java) 
    
  **Linked List** - Implementation for the Linked List
        
     * [Linked List (Singly) : Java](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/main/java/datastructures/linkedlist/java/CustomSinglyLinkedList.java)
     *  [Test Case](https://github.com/ucdevinda123/data-structures-and-algorithms/blob/master/src/test/java/datastructures/TestLinkedList.java)                                                                                                

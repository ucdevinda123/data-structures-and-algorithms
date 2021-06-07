package datastructures.queue.kotlin

class CustomQueueCircularArray<T>(val size: Int) {
    var dataArray: Array<Any?> = arrayOfNulls<Any?>(size)
    var count: Int = 0;
    var head: Int = 0;
    var tail: Int = 0;

    fun enqueue(element: T) {
        if (isFull()) throw IllegalStateException()
        dataArray[tail] = element
        tail = (tail + 1) % size
        count++
    }

    fun dequeue() {
        if (isEmpty()) throw IllegalStateException()
        dataArray[head] = null
        head = (head + 1) % size
        count--
    }

    fun peek(): Any? {
        if (isEmpty()) throw IllegalStateException()
        return dataArray[head]
    }

    fun isEmpty(): Boolean {
        return count == 0
    }

    fun isFull(): Boolean {
        return count == size
    }
}
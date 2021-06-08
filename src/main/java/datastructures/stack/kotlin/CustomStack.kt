package datastructures.stack.kotlin

import java.util.*

class CustomStack<E>(var size: Int) {
    var count: Int = 0
        get() = field
    var array: Array<Any?> = arrayOfNulls(size)

    open fun push(element: E): E {
        if (count == size) throw StackOverflowError("Stack overflow error")
        array[count++] = element
        return element;
    }

    open fun peek(): Any? {
        if (count == 0) throw  IllegalStateException("Empty Stack")
        return array[count - 1];
    }

    open fun pop(): Any? {
        var element: Any? = peek()
        count--;
        return element;
    }

    fun displayStack() {
        println(Arrays.toString(getDataList()))
    }

    fun getDataList(): Array<Any?>? {
        return array.copyOfRange(0, count)
    }

    fun isEmpty() : Boolean { return count == 0}

}
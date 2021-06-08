package datastructures.queue.kotlin

import datastructures.stack.kotlin.CustomStack

class QueueWithTwoStacks<T>(val size : Int) {
    private var primaryStack: CustomStack<T> = CustomStack(size)
    private var secondaryStack: CustomStack<T> = CustomStack(size)


    fun enqueue(item : T){
        primaryStack.push(item)
    }

    fun dequeue() : Any?{
        moveStackData();
        return secondaryStack.pop();
    }

    fun peek() : Any?{
        moveStackData();
        return secondaryStack.peek();
    }

    private fun moveStackData(){
        if(secondaryStack.isEmpty()){
            while (!primaryStack.isEmpty()){
                secondaryStack.push(primaryStack.pop() as T);
            }
        }
    }

    fun isEmpty() : Boolean { return  primaryStack.isEmpty() && secondaryStack.isEmpty() }
}
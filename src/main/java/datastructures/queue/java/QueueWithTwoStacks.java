package datastructures.queue.java;

import datastructures.stack.kotlin.CustomStack;

public class QueueWithTwoStacks<T> {
    private int count;
    private CustomStack<T> primaryStack;
    private CustomStack<T> secondaryStack;
    private int size;

    public QueueWithTwoStacks(int size) {
        this.primaryStack = new CustomStack<>(5);
        this.secondaryStack = new CustomStack<>(5);
        this.size = size;
    }

    public void enqueue(T item){
        if(count == size) throw  new IllegalStateException();
        primaryStack.push(item);
        count++;
    }

    public void dequeue(){
        if(isEmpty()) throw new IllegalStateException();
        movePrimaryStackDataToSecondary();
        secondaryStack.pop();
        count --;
    }

    public Object peek(){
        if(isEmpty()) throw new IllegalStateException();
        movePrimaryStackDataToSecondary();
        return secondaryStack.peek();
    }

    private void movePrimaryStackDataToSecondary(){
        if(secondaryStack.isEmpty()){
            while (!primaryStack.isEmpty()){
                secondaryStack.push((T) primaryStack.pop());
            }
        }
    }

    public boolean isEmpty() { return secondaryStack.isEmpty() && primaryStack.isEmpty(); }
}

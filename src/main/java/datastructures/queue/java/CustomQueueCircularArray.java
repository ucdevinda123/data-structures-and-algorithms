package datastructures.queue.java;

import java.util.Arrays;

public class CustomQueueCircularArray<T> {

    private Object [] dataArray;
    private int size;
    private int count;
    private int head;
    private int tail;

    public CustomQueueCircularArray(int size) {
        this.dataArray = new Object[size];
        this.size = size;
    }

    public void enqueue(T element){
        if(isFull()) throw new IllegalStateException();
        dataArray[tail] = element;
        tail = (tail + 1) % size;
        count++;
    }

    public void dequeue(){
        if(count == 0) throw new IllegalStateException();
        dataArray[head] = null;
        head = (head + 1) % size;
        count--;
    }

    public Object peek(){
        return dataArray[head];
    }

    public boolean isFull() { return count == size;}

    public boolean isEmpty() { return count == 0;}

    public void display(){
        System.out.println(Arrays.toString(dataArray));
    }
}

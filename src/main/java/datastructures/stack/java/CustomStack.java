package datastructures.stack.java;

import java.util.Arrays;

public class CustomStack<E> {

    private int size;
    private int count = 0;
    private Object[] dataList;

    public CustomStack(int size) {
        this.size = size;
        dataList = new Object[size];
    }

    public E push(E e) {
        if (count == dataList.length) throw new StackOverflowError();
        dataList[count++] = e;
        return e;
    }

    public synchronized E peek() {
        if (count == 0) throw new IllegalStateException("Stack is empty");
        return (E) dataList[count - 1];
    }

    public synchronized E pop() {
        E element = peek();
        count--;
        return element;
    }

    public void displayStack() {
        System.out.println(Arrays.toString(getDataList()));
    }

    public int size() {
        return count;
    }

    public Object[] getDataList() {
        return Arrays.copyOfRange(dataList, 0, count);
    }
}
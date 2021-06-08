package datastructures.array.java;

import java.util.Arrays;

public class CustomArray<T> {
    private int size;
    private int count;
    private Object[] dataArray;

    public CustomArray(int size) {
        this.size = size;
        this.dataArray = new Object[size];
    }

    public boolean add(T t) {
        if (isFull()) {
            int length = dataArray.length;
            size = size * 2;
            Object[] newArray = new Object[size];
            for (int i = 0; i < length; i++) {
                newArray[i] = dataArray[i];
            }
            this.dataArray = newArray;
            count++;
            return true;
        }
        this.dataArray[count++] = t;
        return true;
    }

    public boolean removeAt(int index) {
        if (index == -1) throw new IllegalArgumentException();
        this.dataArray[index] = 0;
        for (int i = index; i < count; i++) {
            if (i + index < count) {
                dataArray[i] = dataArray[i + 1];
            }
        }
        count--;
        return true;
    }

    public int indexOf(T item) {
        int length = dataArray.length;
        for (int i = 0; i < length; i++) {
            if (dataArray[i] == item) return i;
        }
        return -1;
    }

    public boolean isFull() {
        return size == count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int getSize() {return count;}

    public void display() {
        Object[] arrayRange = Arrays.copyOfRange(dataArray, 0, count);
        System.out.println(Arrays.toString(arrayRange));
    }
}

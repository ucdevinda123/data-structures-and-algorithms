package datastructures.linkedlist.java;

public class CustomSinglyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    class Node<T> {
        Node<T> next;
        T value;

        public Node(T value) {
            this.value = value;
        }
    }

    //O(1)
    public void addFirst(T item) {
        Node<T> node = new Node<>(item);
        if (head == null) {
            head = tail = node;
        } else {
            Node<T> tempHeadNode = head;
            node.next = tempHeadNode;
            head = node;
        }
        size++;
    }

    //O(1)
    public void addLast(T item) {
        Node<T> node = new Node<>(item);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    //O(1)
    public void removeFirst() {
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
    }

    //O(N) Need to traverse the whole list till the end
    public void removeLast() {
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.next == tail) {
                currentNode.next = null;
                tail = currentNode;
                break;
            }
            currentNode = currentNode.next;
        }
        size--;
    }

    //O(N)
    public int indexOf(T item) {
        Node<T> currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.value == item) return index;
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }

    //O(N)
    public boolean contains(T item) {
        return indexOf(item) != -1;
    }

    public Object[] toArray() {
        Object[] dataArray = new Object[size];
        Node<T> currentNode = head;
        int index = 0;
        if (head == tail) {
            dataArray[index] = head.value;
            return dataArray;
        }
        while (currentNode != null) {
            dataArray[index++] = currentNode.value;
            currentNode = currentNode.next;
        }
        return dataArray;
    }
}
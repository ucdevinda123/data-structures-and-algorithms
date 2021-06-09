package datastructures;

import datastructures.linkedlist.java.CustomSinglyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class TestLinkedList {

    @Test
    public void testLinkedListJava() {
        CustomSinglyLinkedList<Integer> customSinglyLinkedList = new CustomSinglyLinkedList<>();
        customSinglyLinkedList.addLast(10);
        customSinglyLinkedList.addLast(20);
        customSinglyLinkedList.addLast(30);
        customSinglyLinkedList.removeLast();

        Assert.assertFalse(customSinglyLinkedList.contains(30));
        Assert.assertEquals(-1, customSinglyLinkedList.indexOf(30));

        customSinglyLinkedList.removeFirst();

        Assert.assertFalse(customSinglyLinkedList.contains(10));
        Assert.assertEquals(-1, customSinglyLinkedList.indexOf(10));

        customSinglyLinkedList.addFirst(60);
        customSinglyLinkedList.addFirst(70);
        customSinglyLinkedList.addFirst(80);

        Assert.assertTrue(customSinglyLinkedList.contains(60));
        Assert.assertEquals(2, customSinglyLinkedList.indexOf(60));
        Assert.assertEquals(3, customSinglyLinkedList.indexOf(20));

        customSinglyLinkedList.removeLast();
        Assert.assertEquals(-1, customSinglyLinkedList.indexOf(20));
        Assert.assertFalse(customSinglyLinkedList.contains(20));
    }
}

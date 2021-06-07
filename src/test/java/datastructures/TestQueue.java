package datastructures;

import datastructures.queue.java.CustomQueueCircularArray;
import org.junit.Assert;
import org.junit.Test;

public class TestQueue {

    @Test
    public void testQueueCircularArrayJava() {
        CustomQueueCircularArray<Integer> customQueueCircularArray = new CustomQueueCircularArray<>(5);
        customQueueCircularArray.enqueue(10);
        customQueueCircularArray.enqueue(20);
        customQueueCircularArray.enqueue(30);
        customQueueCircularArray.enqueue(40);
        customQueueCircularArray.enqueue(50);

        Assert.assertEquals(10, customQueueCircularArray.peek());
        customQueueCircularArray.dequeue();
        Assert.assertEquals(20, customQueueCircularArray.peek());
        customQueueCircularArray.dequeue();
        Assert.assertEquals(30, customQueueCircularArray.peek());
        customQueueCircularArray.dequeue();
        Assert.assertEquals(40, customQueueCircularArray.peek());
        customQueueCircularArray.dequeue();
        Assert.assertEquals(50, customQueueCircularArray.peek());
        customQueueCircularArray.dequeue();
        Assert.assertEquals(true, customQueueCircularArray.isEmpty());
    }

    @Test
    public void testQueueCircularArrayKotlin() {
        datastructures.queue.kotlin.CustomQueueCircularArray<Integer> customQueueCircularArray = new datastructures.queue.kotlin.CustomQueueCircularArray<>(5);
        customQueueCircularArray.enqueue(10);
        customQueueCircularArray.enqueue(20);
        customQueueCircularArray.enqueue(30);
        customQueueCircularArray.enqueue(40);
        customQueueCircularArray.enqueue(50);

        Assert.assertEquals(10, customQueueCircularArray.peek());
        customQueueCircularArray.dequeue();
        Assert.assertEquals(20, customQueueCircularArray.peek());
        customQueueCircularArray.dequeue();
        Assert.assertEquals(30, customQueueCircularArray.peek());
        customQueueCircularArray.dequeue();
        Assert.assertEquals(40, customQueueCircularArray.peek());
        customQueueCircularArray.dequeue();
        Assert.assertEquals(50, customQueueCircularArray.peek());
        customQueueCircularArray.dequeue();
        Assert.assertEquals(true, customQueueCircularArray.isEmpty());
    }

}

package datastructures;

import datastructures.stack.java.CustomStack;
import org.junit.Assert;
import org.junit.Test;

public class TestStack {

    @Test
    public void testHashStackJava() {
        CustomStack<Integer> stack = new CustomStack<>(5);
        Assert.assertEquals(java.util.Optional.of(10), java.util.Optional.of(stack.push(10)));
        Assert.assertEquals(java.util.Optional.of(20), java.util.Optional.of(stack.push(20)));
        Assert.assertEquals(java.util.Optional.of(30), java.util.Optional.of(stack.push(30)));
        Assert.assertEquals(java.util.Optional.of(40), java.util.Optional.of(stack.push(40)));
        Assert.assertEquals(java.util.Optional.of(50), java.util.Optional.of(stack.push(50)));
        Assert.assertEquals(java.util.Optional.of(50), java.util.Optional.of(stack.peek()));
        Assert.assertEquals(java.util.Optional.of(50), java.util.Optional.of(stack.pop()));
        Assert.assertEquals(4,stack.size());
    }


    @Test
    public void testStackKotlin() {
        datastructures.stack.kotlin.CustomStack<Integer> stack = new datastructures.stack.kotlin.CustomStack<>(5);
        Assert.assertEquals(java.util.Optional.of(10), java.util.Optional.of(stack.push(10)));
        Assert.assertEquals(java.util.Optional.of(20), java.util.Optional.of(stack.push(20)));
        Assert.assertEquals(java.util.Optional.of(30), java.util.Optional.of(stack.push(30)));
        Assert.assertEquals(java.util.Optional.of(40), java.util.Optional.of(stack.push(40)));
        Assert.assertEquals(java.util.Optional.of(50), java.util.Optional.of(stack.push(50)));
        Assert.assertEquals(java.util.Optional.of(50), java.util.Optional.of(stack.peek()));
        Assert.assertEquals(java.util.Optional.of(50), java.util.Optional.of(stack.pop()));
        Assert.assertEquals(4,stack.getCount());
    }
}

package com.stackandqueue;


import org.junit.Assert;
import org.junit.Test;

public class QueueTest {
    @Test
    public void enQueueTest() {
  	  Queue<Integer> queue = new Queue<>();
  	  Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		queue.enQueue(firstNode);
		queue.enQueue(secondNode);
		queue.enQueue(thirdNode);
		queue.printQueue();
		int size = queue.size();
		Assert.assertEquals(3, size);
    }
}

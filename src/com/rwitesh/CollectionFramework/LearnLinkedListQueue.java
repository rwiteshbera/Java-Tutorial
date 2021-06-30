package com.rwitesh.CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(24);
        queue.offer(28);

        System.out.println(queue);

        System.out.println(queue.poll()); // Return and remove the first element

        System.out.println(queue);

        System.out.println(queue.peek()); // Return the head of the queue
    }
}

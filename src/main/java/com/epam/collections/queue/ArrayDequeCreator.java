package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        for(int i=0; i<2; i++) {
            arrayDeque.add(Objects.requireNonNull(firstQueue.poll()));
        }

        for(int i=0; i<2; i++){
            arrayDeque.add(Objects.requireNonNull(secondQueue.poll()));
        }

        while (firstQueue.size()!=0 && secondQueue.size()!=0){
            firstQueue.add(arrayDeque.pollLast());
            for(int i=0; i<2; i++) {
                arrayDeque.add(Objects.requireNonNull(firstQueue.poll()));
            }
            secondQueue.add(arrayDeque.pollLast());
            for(int i=0; i<2; i++) {
                arrayDeque.add(Objects.requireNonNull(secondQueue.poll()));
            }
        }

    return arrayDeque;
    }
}

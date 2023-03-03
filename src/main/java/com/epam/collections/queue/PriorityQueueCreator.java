package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> queue=new PriorityQueue<>(new QueueComparator());
        for (String itemFirst: firstList) {
            queue.add(itemFirst);
        }

        for (String itemSecond: secondList) {
            queue.add(itemSecond);
        }

        return queue;
    }

    class QueueComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }
}

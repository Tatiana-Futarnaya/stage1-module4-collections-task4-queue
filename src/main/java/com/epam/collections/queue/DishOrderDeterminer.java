package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> deque = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            deque.add(i);
        }
        int k = 0;
        while (!deque.isEmpty()) {
            k=(k+everyDishNumberToEat-1)%deque.size();
            int n=deque.remove(k);
            list.add(n);
        }
        return list;
    }
}

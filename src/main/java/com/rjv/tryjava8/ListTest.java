package com.rjv.tryjava8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ListTest {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        for (Map.Entry<Integer, String> entry : map.v){
//        }
        List<Integer> l1 = new LinkedList();
        long startTime = System.nanoTime();
        l1.add(1);
        l1.add(5);
        l1.add(7);
        l1.add(2);
        l1.add(4);
        l1.add(5);
        //l1.add(null);
        long endTime = System.nanoTime();
        System.out.println("Linked List time taken in nano seconds: " + (endTime - startTime));
        for (Integer l : l1) {
            System.out.println(l);
        }

        List<Integer> l2 = new ArrayList<>();
        long startTime2 = System.nanoTime();
        l2.add(1);
        l2.add(5);
        l2.add(7);
        l2.add(2);
        l2.add(4);
        l2.add(5);
        //l2.add(null);
        long endTime2 = System.nanoTime();
        System.out.println("Array List time taken in nano seconds: " + (endTime2 - startTime2));
        for (Integer l : l2) {
            System.out.println(l);
        }
    }
}

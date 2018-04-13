package com.rjv.tryjava8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> l1 = new HashSet();
        long startTime = System.nanoTime();
        l1.add(1);
        l1.add(5);
        l1.add(7);
        l1.add(2);
        l1.add(4);
        l1.add(5);
        l1.add(null);
        long endTime = System.nanoTime();
        System.out.println("HashSet time taken in nano seconds: " + (endTime - startTime));
        for (Integer l : l1) {
            System.out.println(l);
        }

        Set<Integer> l2 = new TreeSet<>();
        long startTime2 = System.nanoTime();
        l2.add(1);
        l2.add(5);
        l2.add(7);
        l2.add(2);
        l2.add(4);
        l2.add(5);
        // l2.add(null);
        long endTime2 = System.nanoTime();
        System.out.println("TreeSet time taken in nano seconds: " + (endTime2 - startTime2));
        //System.out.println(l2.remove(4));
        for (Integer l : l2) {
            System.out.println(l);
        }
    }
}

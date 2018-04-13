package com.rjv.tryjava8;

import java.util.TreeSet;

public class TestOverLoading implements Comparable {

    public void get(String t) {
        System.out.println("In String block");
    }

    public void get(Object t) {
        System.out.println("In Object block");
    }

    public static void main(String args[]) {
        TestOverLoading t = new TestOverLoading();
        t.get(null);

        TestOverLoading t1 = new TestOverLoading();

        TreeSet<TestOverLoading> testOverLoadingTreeSet = new TreeSet<>();
        testOverLoadingTreeSet.add(t);
        testOverLoadingTreeSet.add(t1);
        System.out.println(testOverLoadingTreeSet.size());

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

package com.rjv.tryjava8;

public class TestThread {
    public static void main(String args[]) {
        Thread t1 = new Thread(new ThreadApp(), "t1");
        Thread t2 = new Thread(new ThreadApp(), "t2");
        System.out.println("Starting Runnable threads");
        t1.start();
        t2.start();
        System.out.println("Runnable Threads has been started");
        
    }
}

package com.rjv.tryjava8;
import java.io.IOException;

public class TestException {

    public int get() {
        try {
            //return 1;
           throw new IOException();
        } catch (Exception e) {
            System.out.println("In Catch block");
            return 3;
        } finally {
            System.out.println("In Finally block");
            return 2;
        }
    }

    public static void main(String args[]) {
        TestException t = new TestException();
        System.out.println(t.get());
    }
}

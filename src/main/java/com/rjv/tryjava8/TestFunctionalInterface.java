package com.rjv.tryjava8;

@FunctionalInterface
public interface TestFunctionalInterface {
    void execute();
    default void run(){
        System.out.println("I'm here in default!!!");
    }
    default void run1(){
        System.out.println("I'm here in default1!!!");
    }
    default void run2(){
        System.out.println("I'm here in default2!!!");
    }
    static void staticMethod(){
        System.out.println("I'm here in static!!!");
    }
    static void staticMethod1(){
        System.out.println("I'm here in static1!!!");
    }

    String toString();
}

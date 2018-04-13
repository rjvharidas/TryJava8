package com.rjv.tryjava8;

public class TestFunInterfc implements TestFunctionalInterface{
    @Override
    public void execute() {

    }

    @Override
    public void run() {
        System.out.println("I'm here in Overrided default!!!");
    }

    public static void staticMethod1(){
        System.out.println("I'm here in Overided staticMethod1!!!");
    }

    public static void main(String args[]) {
        TestFunctionalInterface t = new TestFunInterfc();
        TestFunInterfc t1 = new TestFunInterfc();
        TestFunInterfc.staticMethod1();
    }
}

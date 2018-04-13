package com.rjv.tryjava8;

import java.util.Arrays;

public abstract class TestAbstratctClass {
    public abstract void testMe();
}
class TestAbstratctClassChild extends TestAbstratctClass{

    String a ="400";
    String b = "200";

    @Override
    public void testMe()
    {
    }

    public String[] testSort() {
        String[] str = {a, b};
        return str;
    }

    public static void main(String args[]){
        TestAbstratctClassChild t = new TestAbstratctClassChild();
        String[]s =t.testSort();
        Arrays.sort(s);
        System.out.println("Sorted : " + s[0]);
    }
}

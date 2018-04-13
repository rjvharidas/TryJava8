package com.rjv.tryjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TestIntStream {
    public static void main(String[] args){
        ArrayList<Integer> integers = new ArrayList<Integer>(){{add(1); add(7); add(5); add(3); add(0);}};
        integers.remove(3);
        integers.add(9);
        IntStream.range(0,integers.size()).forEach(i -> System.out.println(integers.get(i)));
    }
}

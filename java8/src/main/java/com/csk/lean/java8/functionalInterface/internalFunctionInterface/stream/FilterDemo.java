package com.csk.lean.java8.functionalInterface.internalFunctionInterface.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chensk on 2017/1/9.
 */
public class FilterDemo {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        stringCollection.stream().filter((s)->s.startsWith("a")).forEach(System.out::println);
    }
}

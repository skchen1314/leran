package com.csk.lean.java8.functionalInterface.internalFunctionInterface.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chensk on 2017/1/9.
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            System.out.println(map.putIfAbsent(i, "val" + i));
        }

        System.out.println(map.putIfAbsent(3, "test"));
        System.out.println(map.putIfAbsent(11, "test"));
        System.out.println(map.putIfAbsent(11, ""));
        System.out.println(map.get(11));

//        System.out.println(map.computeIfPresent(3, (num, val) -> val + num));
//        System.out.println(map.get(3));           // val33
//
//        map.computeIfPresent(9, (num, val) -> null);
//        System.out.println(map.containsKey(9));     // false
//
//        map.computeIfAbsent(23, num -> "val" + num);
//        System.out.println(map.containsKey(23));    // true
//
//        map.computeIfAbsent(3, num -> "bam");
//        System.out.println(map.get(3));
//
//        map.computeIfAbsent(11, num -> "bam");
//        System.out.println(map.get(11));             // val33


    }
}

package com.csk.lean.java8.functionalInterface.internalFunctionInterface;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by chensk on 2017/1/9.
 */
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> s.length() > 0;

        System.out.println(predicate.test("foo"));              // true
        System.out.println(predicate.negate().test("foo"));     // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        Object o;
        System.out.println();

    }
}

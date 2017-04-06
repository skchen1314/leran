package com.csk.lean.java8.functionalInterface;

/**
 * Created by chensk on 2017/1/9.
 */
public class MethodOrConstructReferDemo {
    public static void main(String[] args) {
        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted);   // 123

        Converter<String, String> converter2 = String::toLowerCase;
        String converted2 = converter2.convert("Java");
        System.out.println(converted2);    // "J"

    }
}

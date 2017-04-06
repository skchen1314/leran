package com.csk.lean.java8.functionalInterface;



/**
 * Created by chensk on 2017/1/9.
 */
public class ObjectFieldAndStaticVars {
    static int outerStaticNum;
    int outerNum;

    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
    }

    public static void main(String[] args) {
        ObjectFieldAndStaticVars obj = new ObjectFieldAndStaticVars();
        obj.testScopes();
        System.out.println(outerStaticNum);
    }
}

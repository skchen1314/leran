package com.csk.basic.refer;

/**
 * Created by Administrator on 2016/11/17.
 * question:为什么1000 == 1000返回为False，而100 == 100会返回为True?
 */
public class IntegerDemo {
    public static void main(String[] args) {
        Integer a = 1000, b = 1000;
        System.out.println(a == b);//1
        Integer c = 100, d = 100;
        System.out.println(c == d);//2
    }
}

package com.sunsharing.base.service.impl;

import com.sunsharing.base.service.api.HelloWorld;

/**
 * Created by chensk on 2016/12/20.
 */
public class HelloWorldImpl2 implements HelloWorld {
    public void printHelloWorld()
    {
        System.out.println("Enter HelloWorldImpl2.printHelloWorld()");
    }

    public void doPrint()
    {
        System.out.println("Enter HelloWorldImpl2.doPrint()");
        return ;
    }
}

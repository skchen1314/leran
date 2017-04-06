package com.demo.design_pattern.struct.proxy.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by chensk on 2016/8/11.
 */
public class DynamicProxy implements InvocationHandler {
    private Subject subject;

    public DynamicProxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before the method invoke ");
        System.out.println("Method:" + method);
        method.invoke(subject, args);
        System.out.println("after the method invoke");
        return null;
    }
}

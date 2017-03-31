package com.csk.basic.inter_outer;

/**
 * Created by chensk on 2016/12/13.
 */
public class ReferClass {
    private OuterClass.NestedStaticClass nestedStaticClass;

    public ReferClass(String name){
        nestedStaticClass = new OuterClass.NestedStaticClass(name);
    }

    public void printName(){
        nestedStaticClass.printMessage();
    }
}

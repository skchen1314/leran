package com.csk.basic.inter_outer;

/**
 * Created by chensk on 2016/12/13.
 *
 （1）内部静态类不需要有指向外部类的引用。但非静态内部类需要持有对外部类的引用。
 （2）非静态内部类能够访问外部类的静态和非静态成员。静态类不能访问外部类的非静态成员。他只能访问外部类的静态成员。
 （3）一个非静态内部类不能脱离外部类实体被创建，一个非静态内部类可以访问外部类的数据和方法，因为他就在外部类里面。
 */
/* 下面程序演示如何在java中创建静态内部类和非静态内部类 */
public class OuterClass{
    private static String msg = "GeeksForGeeks";

    private NestedStaticClass nestedStaticClass;

    public OuterClass(){
        nestedStaticClass = new NestedStaticClass("default");
    }

    public void printNestedStaticClassName(){
        nestedStaticClass.printNestedStaticClassName();
    }

    // 静态内部类
    public static class NestedStaticClass{
        public NestedStaticClass(String name) {
            this.name = name;
        }

        private String name;

        private void printNestedStaticClassName(){
            System.out.println("NestedStaticClass Name is :" + name);
        }

        // 静态内部类只能访问外部类的静态成员
        public void printMessage() {
            // 试着将msg改成非静态的，这将导致编译错误
            System.out.println("Message from nested static class: " + msg + ",and my name is " + name);
        }
    }
    // 非静态内部类
    public class InnerClass{
        // 不管是静态方法还是非静态方法都可以在非静态内部类中访问
        public void display(){
            System.out.println("Message from non-static nested class: "+ msg);
        }
    }
}

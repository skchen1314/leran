package com.csk.basic.inter_outer;

/**
 * Created by chensk on 2016/12/13.
 */
public class Main {
    // 怎么创建静态内部类和非静态内部类的实例
    public static void main(String args[]){
        // 创建静态内部类的实例
        OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass("KK");
        // 创建静态内部类的非静态方法
        printer.printMessage();
        // 为了创建非静态内部类，我们需要外部类的实例
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        outer.printNestedStaticClassName();
        // 调用非静态内部类的非静态方法
        inner.display();
        // 我们也可以结合以上步骤，一步创建的内部类实例
        OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();
        // 同样我们现在可以调用内部类方法
        innerObject.display();

        OuterClass.NestedStaticClass printer2 = new OuterClass.NestedStaticClass("CC");
        // 创建静态内部类的非静态方法
        printer2.printMessage();
    }
}

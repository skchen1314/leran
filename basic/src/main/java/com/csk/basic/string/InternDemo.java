package com.csk.basic.string;

/**
 * Created by chensk on 2017/1/22.
 *
 * 当调用 intern 方法时，如果池已经包含一个等于此 String 对象的字符串（该对象由 equals(Object) 方法确定），
 * 则返回池中的字符串。否则，将此 String 对象添加到池中，并且返回此 String 对象的引用。
 * 它遵循对于任何两个字符串 s 和 t，当且仅当 s.equals(t) 为 true 时，s.intern() == t.intern() 才为 true。
 * 所有字面值字符串和字符串赋值常量表达式都是内部的。
 */
public class InternDemo {
    public static void main(String[] args) {
//       demo1();
        demo2();
//        demo3();
    }

    public static void demo1() {
        String str1 = "a";
        String str2 = "b";
        String str3 = "ab";
        String str4 = str1 + str2;
        String str5 = new String("ab");

        System.out.println(str5.equals(str3));
        System.out.println(str5 == str3);
        System.out.println(str5.intern() == str3);
        System.out.println(str5.intern() == str4);
    }

    public static void demo2(){
        String a = new String("ab");
        String b = new String("ab");
        String c = "ab";
        String d = "a" + "b";
        String e = "b";
        String f = "a" + e;
        String g = "a" + "b";

        System.out.println(b.intern() == a);//false
        System.out.println(b.intern() == c);//true
        System.out.println(b.intern() == d);//true
        System.out.println(b.intern() == f);//why is false?
        System.out.println(b.intern() == a.intern());//true
        System.out.println(b.intern() == g);//true
    }

    public static void demo3(){
        String a = "abc";
        String b = "abc";
        String c = "a" + "b" + "c";
        String d = "a" + "bc";
        String e = "ab" + "c";

        System.out.println(a == b);//true
        System.out.println(a == c);//true
        System.out.println(a == d);//true
        System.out.println(a == e);//true
        System.out.println(c == d);//true
        System.out.println(c == e);//true
    }
}

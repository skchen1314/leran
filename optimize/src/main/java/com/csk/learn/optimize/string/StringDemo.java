package com.csk.learn.optimize.string;

/**
 * Created by chensk on 2016/8/22.
 */
public class StringDemo {
    /**
     * 把一个基本数据类型转为字符串，基本数据类型.toString()是最快的方式、String.valueOf(数据)次之、数据+”"最慢
     * @param args
     */
    public static void main(String[] args) {
        int loopTime = 50000;
        Integer i = 0;
        long startTime = System.currentTimeMillis();
        for (int j = 0; j < loopTime; j++)
        {
            String str = String.valueOf(i);
        }
        System.out.println("String.valueOf()：" + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        for (int j = 0; j < loopTime; j++)
        {
            String str = i.toString();
        }
        System.out.println("Integer.toString()：" + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        for (int j = 0; j < loopTime; j++)
        {
            String str = i + "";
        }
        System.out.println("i + \"\"：" + (System.currentTimeMillis() - startTime) + "ms");
    }
}

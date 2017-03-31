package com.csk.basic.thread.impl.pool;

/**
 * Created by chensk on 2017/3/16.
 */
public class TestTask extends Task {

    private   int i ;

    public TestTask(int i) {
        this.i = i;

    }

    public void run() {
        System.out.println("Hello world");
        System.out.println(i+"");
    }

}

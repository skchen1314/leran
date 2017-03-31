package com.csk.basic.thread.lock.synchronize;

/**
 * Created by chensk on 2017/3/17.
 */
public class ThreadTest3 extends Thread{
    private int threadNo;

    public ThreadTest3(int threadNo){
        this.threadNo = threadNo;
    }

    public static synchronized void increment(int threadNo){
        for (int i = 0; i < 10000; i++) {
            System.out.println("Thread:" + threadNo + "." + i);
        }
    }

    public void run() {
        increment(threadNo);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new ThreadTest3(i).start();
        }
    }
}
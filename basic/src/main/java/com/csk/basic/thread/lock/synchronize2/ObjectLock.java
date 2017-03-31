package com.csk.basic.thread.lock.synchronize2;

/**
 * Created by chensk on 2017/3/17.
 */
public class ObjectLock {
    public static void main(String[] args) {
        System.out.println("start time = " + System.currentTimeMillis()+"ms");
        LockTestClass test = new LockTestClass();
        for (int i = 0; i < 3; i++) {
            Thread thread = new ObjThread(test, i);
            thread.start();
        }
    }
}

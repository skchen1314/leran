package com.csk.basic.thread.lock.synchronize2;

import java.util.Random;

/**
 * Created by chensk on 2017/3/17.
 */
public class ObjThread extends Thread {
    LockTestClass lock;
    int i = 0;

    public ObjThread(LockTestClass lock, int i) {
        this.lock = lock;
        this.i = i;
    }

//    public void run() {
//        //无锁方法
////		lock.noSynMethod(this.getId(),this);
//        //对象锁方法1，采用synchronized synInMethod的方式
////        lock.synInMethod();
//        //对象锁方法2，采用synchronized(this)的方式
////		lock.synOnMethod();
//        //私有锁方法，采用synchronized(object)的方式
////		lock.synMethodWithObj();
//        //类锁方法，采用static synchronized increment的方式
//        LockTestClass.increament();
//        lock.increament2();
//    }

    public void run() {
        Random seed = new Random();
        int n = seed.nextInt(100);
        if(n % 2 == 0){
//            lock.synMethodWithObj();
            LockTestClass.increament();
        }
        else {
//            lock.synMethodWithObj2();
            lock.increament2();
        }

    }
}

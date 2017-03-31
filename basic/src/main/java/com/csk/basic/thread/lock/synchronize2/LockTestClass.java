package com.csk.basic.thread.lock.synchronize2;

/**
 * Created by chensk on 2017/3/17.
 */
public class LockTestClass {
    //用于类锁计数
    private static int i = 0;
    //私有锁
    private Object jbo = new Object();
    private Object obj = new Object();

    /**
     * &lt;p&gt;
     * 无锁方法
     *
     * @param threadID
     * @param thread
     */
    public void noSynMethod(long threadID, ObjThread thread) {
        System.out.println("nosyn: class obj is " + thread + ", threadId is"
                + threadID);
    }

    /**
     * 对象锁方法2
     */
    public synchronized void synOnMethod2() {
        System.out.println("synOnMethod2"  + " begins" + ", time = "
                + System.currentTimeMillis() + "ms");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("synOnMethod2"   + " ends");
    }

    /**
     * 对象锁方法1
     */
    public synchronized void synOnMethod() {
        System.out.println("synOnMethod"  + " begins" + ", time = "
                + System.currentTimeMillis() + "ms");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("synOnMethod"   + " ends");
    }

    /**
     * 对象锁方法2,采用synchronized (this)来加锁
     */
    public void synInMethod() {
        synchronized (this) {
            System.out.println("synInMethod"  + " begins" + ", time = "
                    + System.currentTimeMillis() + "ms");
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("synInMethod"  + " ends");
        }

    }

    /**
     * 对象锁方法3
     */
    public void synMethodWithObj() {
        System.out.println("Thread:" + Thread.currentThread().getId() + " prepare to get the jbo");
        synchronized (jbo) {
            System.out.println("Thread:" + Thread.currentThread().getId() + " get the jbo");
            System.out.println("synMethodWithObj"  + " begins" + ", time = "
                    + System.currentTimeMillis() + "ms");
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("synMethodWithObj"  + " ends");
            System.out.println("Thread:" + Thread.currentThread().getId() + " release the jbo");
        }
    }

    public void synMethodWithObj2() {
        System.out.println("Thread:" + Thread.currentThread().getId() + " prepare to get the obj");
        synchronized (obj) {
            System.out.println("Thread:" + Thread.currentThread().getId() + " get the obj");
            System.out.println("synMethodWithObj2"  + " begins" + ", time = "
                    + System.currentTimeMillis() + "ms");
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("synMethodWithObj2"  + " ends");
            System.out.println("Thread:" + Thread.currentThread().getId() + " release the obj");
        }
    }

    /**
     * 类锁
     */
    public static synchronized void increament() {
        System.out.println("Thread:" + Thread.currentThread().getId() + " get the increament");
        System.out.println("class synchronized. i = "  + i +", time = "
                + System.currentTimeMillis() + "ms");
        i++;
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("class synchronized ends.");
        System.out.println("Thread:" + Thread.currentThread().getId() + " release the increament");
    }

    public synchronized void increament2() {
       synchronized (LockTestClass.class){
           System.out.println("Thread:" + Thread.currentThread().getId() + " get the increament2");
           System.out.println("class synchronized2. i = "  + i + ", time = "
                   + System.currentTimeMillis() + "ms");
           i++;
           try {
               Thread.sleep(2000L);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("class synchronized2 ends.");
           System.out.println("Thread:" + Thread.currentThread().getId() + " release the increament2");
       }
    }

}
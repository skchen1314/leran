package com.csk.basic.thread.pool;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by chensk on 2017/1/24.
 */
public class FixedThreadPoolExecutorTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        final DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        for (int i = 0; i < 1000; i++) {
            executorService.execute(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " " + df.format(new Date()));
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

    }
}

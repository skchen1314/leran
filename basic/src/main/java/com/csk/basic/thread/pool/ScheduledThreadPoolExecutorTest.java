package com.csk.basic.thread.pool;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by chensk on 2017/1/24.
 */
public class ScheduledThreadPoolExecutorTest {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        final DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.print(Thread.currentThread().getName() + " " + df.format(new Date()));
                System.out.println(" delay 1 seconds, and excute every 3 seconds");
            }
        }, 1, 3, TimeUnit.SECONDS);
    }
}

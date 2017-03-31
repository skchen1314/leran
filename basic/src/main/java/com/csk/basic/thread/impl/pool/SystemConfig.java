package com.csk.basic.thread.impl.pool;

/**
 * Created by chensk on 2017/3/16.
 */
public class SystemConfig {

    static final int THREAD_DEFAULT_COUNT = 10;

    public static int getThreadDefaultCount() {
        return THREAD_DEFAULT_COUNT;
    }
}
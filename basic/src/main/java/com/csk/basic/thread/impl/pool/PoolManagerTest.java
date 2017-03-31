package com.csk.basic.thread.impl.pool;


/**
 * Created by chensk on 2017/3/16.
 */
public class PoolManagerTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ThreadPoolManager threadpoolmanager = new ThreadPoolManager("SimpleThreadPoll");
        threadpoolmanager.threadPoolStart();
        Task newTask = new TestTask(1);
        threadpoolmanager.addTask(newTask);
        newTask = new TestTask(2);
        threadpoolmanager.addTask(newTask);
        newTask = new TestTask(3);
        threadpoolmanager.addTask(newTask);
        newTask = new TestTask(4);
        threadpoolmanager.addTask(newTask);
        newTask = new TestTask(5);
        threadpoolmanager.addTask(newTask);
        newTask = new TestTask(6);
        threadpoolmanager.addTask(newTask);
        //threadpoolmanager.threadPoolEnd();

    }
}

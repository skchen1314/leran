package com.csk.basic.thread.impl.pool;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by chensk on 2017/3/16.
 */
public class ThreadPoolManager extends ThreadGroup {

    /**线程池是否开启标识*/
    int flagThreadPoolValid = 0;

    /**线程池中线程的数量，从系统配置类中获取*/
    int threadSize = SystemConfig.getThreadDefaultCount();

    /**任务队列*/
    /**
     Java 2 SE Documentation.
     Returns a synchronized (thread-safe) list backed by the specified list.
     In order to guarantee serial access, it is critical that all access to
     the backing list is accomplished through the returned list.
     根据指定的参数list，返回一个线程安全的同步的list。
     为了保证有序访问，所有的对于参数list的访问都应该通过返回的这个list去进行。
     It is imperative that the user manually synchronize
     on the returned list when iterating over it.
     如果进行迭代访问的时候，对于返回的队列应用程序本身进行同步处理是必要的。
     注：即使用迭代器访问应该使用synchronized(){}修饰代码块，使得其对list的访问进行同步；
     而如果是采用返回的list的add等方法，则应用程序本身不需要进行同步处理。

     另外由于本类中对ThreadPoolManager的访问方法都进行了同步操作，
     因此对本List的同步不是必要的。
     当然，由于加锁顺序一致性，使用对List的同步，也不会导致线程死锁。
     List<Task> TaskList= Collections.synchronizedList(new LinkedList<Task>());

     */
    List<Task> TaskList= new LinkedList<Task>();

    /**线程池管理类构造方法*/
    public ThreadPoolManager(String threadpoolname) {

        //ThreadGroup的名称
        super(threadpoolname);

        //继承自父类的方法，设置是否是守护线程
        setDaemon(true);

    }

    /**
     * @brief 开启线程池
     * @param
     * @return void
     */
    public synchronized void threadPoolStart(){

        if(threadSize ==0 || flagThreadPoolValid !=0){

            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }

            return ;
        }

        if( TaskList ==null ){

            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }

            return;
        }

        // 创建并开启线程例程
        for (int i = 0;i<threadSize;i++){

            new WorkThread(i).start();

        }

        flagThreadPoolValid = 1;

    }

    /**
     * @brief 关闭线程池
     * @return void
     */
    public synchronized void threadPoolEnd(){

        if(threadSize ==0 || flagThreadPoolValid !=1){

            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }

            return;

        }
        if(TaskList ==null ){

            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }

            return;
        }

        TaskList.clear();
        threadSize = 0;
        flagThreadPoolValid = 0;

        // 继承自父类，中断ThreadGroup中添加的所有线程
        interrupt();

    }

    /**
     * @brief 向线程池管理类的任务队列中添加任务
     * @param newTask Task任务类
     * @return void
     */
    public synchronized void addTask(Task newTask){

        if(TaskList == null ){

            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }

            return;
        }

        TaskList.add(newTask);

        //唤醒一个正在getTask()方法中等待任务的工作线程
        notify();

    }

    /**
     * @brief 获取线程池中任务队列中的任务
     * @return Task类
     */
    public synchronized Task getTask(){

        if(TaskList ==null ){

            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }
        /**
         Java 2 SE Documentation.
         As in the one argument version,
         interrupts and spurious wakeups are possible,
         and this method should always be used in a loop.
         正如具有一个参数的函数版本，
         由于wait()函数调用过程中可能发生中断、虚假唤醒，
         因此这个方法必须在检测循环中使用。
         另外，在这里，如果不使用while循环，存在如下一种问题：
         抛出地址越界异常。
         例如：
         主线程添加了一个任务，这样会唤醒一个线程。在这个线程被唤醒执行。
         此时主线程添加另外一个任务，又唤醒一个线程。
         第一个线程其抓取任务后，继续抓取下一个任务执行，也就是抓取添加的第二个任务。
         这样队列中已经不存在任务。第二个被唤醒的线程必然在执行remove(0)的时候抛出上述异常。

         而且也不能仅仅是if判断，因为唤醒获取锁后，
         会直接执行wait()后的代码，只有while可以达到进行判断的目的。
         */
        while(TaskList.size() == 0 ){

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        return  TaskList.remove(0);

    }

    /**
     * @brief 内部类，工作线程类
     */
    private class WorkThread extends Thread{

        public WorkThread(int threadID) {

            //父类构造方法,将线程加入到ThreadGroup中
            super(ThreadPoolManager.this,""+threadID);
        }

        /**
         * @brief 重写父类Thread的run方法
         * @return void
         */
        public void run(){

            //isInterrupted()方法继承自Thread类，判断线程是否被中断
            while(! isInterrupted()){

                Task runTask = getTask();

                //getTask()返回null或者线程执行getTask()时被中断
                if(runTask == null)    break ;

                runTask.run();

            }

        }

    }
}

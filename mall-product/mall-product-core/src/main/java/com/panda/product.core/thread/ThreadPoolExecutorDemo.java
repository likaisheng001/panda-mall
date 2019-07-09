package com.panda.product.core.thread;

import com.sun.jmx.snmp.Timestamp;
import org.jboss.logging.Logger;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;


/**
 * 线程池化技术的小例子 使用MyExtendThreadPoolExecutor实现的池化技术小例子
 * 2018/1/30
 *
 * @author: likaisheng
 */
public class ThreadPoolExecutorDemo {
    Logger logger = Logger.getLogger(ThreadPoolExecutorDemo.class);
    MyExtendThreadPoolExecutor pool = new MyExtendThreadPoolExecutor(3,3,60L, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());

    public void addToThreadPool(Runnable runnable){
        BlockingQueue<Runnable> waitThreadQueue = pool.getQueue(); // Return the task queue
        LinkedBlockingQueue<Runnable> workThreadQueue = pool.getWorkBlockingQueue(); // Returns the running work
        Thread newThread = new Thread(runnable); // 需要执行的任务线程
//      判断任务是否存在正在运行的线程或存在阻塞队列，不存在的就加入线程池（这里的比较要重写equals()）
        if(!waitThreadQueue.contains(newThread) && !workThreadQueue.contains(newThread)){
            Timestamp recordtime = new Timestamp(System.currentTimeMillis());
            logger.info("a_workThread:recordId="+newThread.getId()+",name="+newThread.getName()+" add to  workThreadQueue");
            pool.execute(newThread); // 添加到线程池
        }else {
            logger.info("i_workThread:recordId="+newThread.getId()+",name="+newThread.getName()+" in  waitThreadQueue or workThreadQueue");
        }
    }

    public static void main(String[] args) {
        MyExtendThreadPoolExecutor pooll = new MyExtendThreadPoolExecutor(10,20,60L, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
        for(int i = 0; i < 10; i++){
            Runnable r = new Runnable(){
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "    00000000000000");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            pooll.execute(r);
        }
    }
}

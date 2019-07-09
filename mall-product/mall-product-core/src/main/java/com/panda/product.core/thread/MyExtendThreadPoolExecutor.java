package com.panda.product.core.thread;

import org.apache.log4j.Logger;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 2018/1/30
 *
 * @author: likaisheng
 */

public class MyExtendThreadPoolExecutor extends ThreadPoolExecutor {
    public Logger logger = Logger.getLogger(MyExtendThreadPoolExecutor.class);
    private LinkedBlockingQueue<Runnable> workBlockingQueue = new LinkedBlockingQueue<Runnable>(); // 记录运行中的任务

    public MyExtendThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> woekqueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, woekqueue);
    }
    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        super.beforeExecute(t,r);
        workBlockingQueue.add(r); // 保存运行中的任务
        logger.info("Before the task execution");
    }
    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        super.afterExecute(r,t);
        workBlockingQueue.remove(r);
        logger.info("After the task execution");
    }
    // 获取运行中的任务
    public LinkedBlockingQueue<Runnable> getWorkBlockingQueue(){
        return workBlockingQueue;
    }
}

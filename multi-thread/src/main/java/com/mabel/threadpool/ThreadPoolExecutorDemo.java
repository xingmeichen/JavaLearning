package com.mabel.threadpool;

import com.mabel.ticket.TicketThread;

import java.util.concurrent.*;

/**
 * @project: JavaLearning
 * @description: 线程池使用示例
 * @author: Mabel.Chen
 * @create: 2020-03-06 10:54
 **/
public class ThreadPoolExecutorDemo {

    public static void main(String[] args) {
        // Executors 工具类实际上还是通过 ThreadPoolExecutor 的构造方法去创建的线程池
        Executor executor = Executors.newCachedThreadPool();
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        for (int i = 1; i <= 10; i++) {
            Thread thread = threadFactory.newThread(new TicketThread("Thread_" + i));
            executor.execute(thread);
        }
    }
}

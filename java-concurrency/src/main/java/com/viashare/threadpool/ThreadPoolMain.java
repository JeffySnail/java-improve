package com.viashare.threadpool;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by Jeffy on 17/5/6.
 */
public class ThreadPoolMain {

    public static void main(String[] args) {

        ThreadPool threadPool = new ThreadPool(1, 7, 1, TimeUnit.SECONDS, new SynchronousQueue<>());
        threadPool.submit(() -> {
            System.err.println("i am running");
        });


        System.err.println(threadPool.getTaskCount());
        System.err.println("active  "+threadPool.getActiveCount());
        System.err.println(threadPool.getLargestPoolSize());
        System.err.println("complete count "+threadPool.getCompletedTaskCount());
    }

    private static void shutDown(ExecutorService pool) {

        pool.shutdown();
        try {
            if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
                pool.shutdownNow();
                if(pool.awaitTermination(60,TimeUnit.SECONDS)){
                    System.err.println("Pool did not terminate");
                }
            }
        } catch (Exception e) {
            pool.shutdown();
            Thread.currentThread().interrupt();
        }
    }
}

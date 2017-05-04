package com.viashare.executor;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.concurrent.*;

/**
 * Created by Jeffy on 17/4/21.
 */
public class AbstractExecutorMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        ThreadPoolExecutor
//        ExecutorService pool = Executors.newFixedThreadPool(1, new Threads());
        ThreadPoolExecutor pool = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        Executors.callable(()->{
            System.err.println("i am a task");
        },"这是为什么呢");

        Future<?> future
                = pool.submit(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.err.println("我是个坏人");


        });

        pool.submit(()->{
            System.err.println(Thread.currentThread().getName());
            System.err.println("我是个坏人啊啊啊");
        });
        System.err.println(pool.getActiveCount());
//        pool.shutdownNow();
//        int COUNT_BITS = Integer.SIZE;
//        System.err.println(1 << 7);
//        System.err.println(Integer.MAX_VALUE);
//        double integer = Math.pow(2, 2);
//        System.err.println(0 << COUNT_BITS);

    }

    static class Threads implements ThreadFactory {

        @Override
        public Thread newThread(Runnable r) {

            return new Thread(r,"Hello  就是个蛋蛋 ");
        }
    }

}

package com.viashare.executor;


import java.util.concurrent.*;

/**
 * Created by Jeffy on 17/4/21.
 */
public class ExecutorServiceMain {

    //创建一个线程池
    static ExecutorService pool = Executors.newFixedThreadPool(5);

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
//        pool.execute(new OpenTV());
        Future<String> openTvFuture = pool.submit(new OpenDoor());
        System.err.println(openTvFuture.get(6L,TimeUnit.SECONDS));
        shutDown(pool);
    }

    static class OpenTV implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.err.println("I have open the tv");
        }
    }

    static class OpenDoor implements Callable<String>{

        @Override
        public String call() throws Exception {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "I love java";
        }
    }

    public static void shutDown(ExecutorService pool){
        pool.shutdown();
        try {
            if(!pool.awaitTermination(6,TimeUnit.SECONDS)){
                pool.shutdownNow();
            }
            if(!pool.awaitTermination(6,TimeUnit.SECONDS)){
                System.err.println("something is wrong");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            pool.shutdownNow();
            Thread.interrupted();

        }

    }


}

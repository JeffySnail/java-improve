package com.viashare.executor;

import sun.nio.ch.PollArrayWrapper;

import java.util.concurrent.*;

/**
 * Created by Jeffy on 17/4/21.
 */
public class SchduledExecutorMain {

    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledFuture<String> scheduled = scheduler.schedule(new RollTheBell(), 5, TimeUnit.SECONDS);
        System.err.println(scheduled.get());

        Job job = new Job();
        ScheduledFuture<?> jobScheduled = scheduler.scheduleAtFixedRate(job, 10, 10, TimeUnit.SECONDS);
        System.err.println(jobScheduled.get());
//        ExecutorServiceMain.shutDown(scheduler);
    }


    static class RollTheBell implements Callable<String> {

        @Override
        public String call() throws Exception {
            System.out.println("我是 5秒之后执行的");
            return "I love java";
        }
    }

    static class Job implements Runnable {

        public void run() {
            System.out.println("十秒之后每十秒执行一次");
        }

    }
}

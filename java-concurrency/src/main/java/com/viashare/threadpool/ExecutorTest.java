package com.viashare.threadpool;

import java.net.ServerSocket;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by Jeffy on 17/5/8.
 */
public class ExecutorTest {

    public static void main(String[] args) {

        System.err.println("0000000006535268".length());
        Test test =new Test();
        test.execute(()->
        {
            System.err.println("i am a runner");
        });

//        AbstractExecutorService
//        ThreadPoolExecutor
    }

    static class Test implements Executor{

        @Override
        public void execute(Runnable command) {
            new Thread(command).start();
        }
    }
}

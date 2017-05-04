package com.viashare.threadlocal;

/**
 * Created by Jeffy on 17/4/24.
 */
public class ThreadLocalMain {

    private static ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) {
        threadLocal.set("today is good");
        MyThread myThread = new MyThread();
        myThread.start();
        System.err.println(threadLocal.get());
        Thread myThread2 = new Thread(new MyThread2());
        myThread2.start();
        String name = "{\"name\":\"jeffy\",\"sex\":\"boy\",\"good\":{\"goodName\":\"appale\",\"goodWeight\":\"15\"}}";
    }


    static class MyThread extends Thread{

        @Override
        public void run() {
            System.err.println(threadLocal.get());
        }
    }

    static class MyThread2 implements Runnable{

        @Override
        public void run() {
            System.err.println(threadLocal.get());
        }
    }
}

package com.viashare.racecondition;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Jeffy on 17/4/20.
 */
public class DemoMain{

    private static final int THREAD_COUNT = 100;

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for (int i=0;i<THREAD_COUNT;i++) {
            new Thread(()->{
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter.add(1);
            }).start();

        }
        Thread.sleep(1000);
        System.err.println(counter.getCount());
    }
    static class Counter {

        private int count = 0;

        public synchronized void add(int value){
            this.count = this.count + value;
        }

        public int getCount(){
            return this.count;
        }
    }

}

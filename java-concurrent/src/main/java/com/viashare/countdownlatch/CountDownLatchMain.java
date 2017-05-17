package com.viashare.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Jeffy on 15/12/11.
 */
public class CountDownLatchMain {

    private static final int COUNT_NUM = 10;

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(COUNT_NUM);

        for(int i = 0;i<COUNT_NUM;i++){
            new Thread(new ThreadTask(countDownLatch,i)).start();

        }
        Thread.sleep(5000);//主要是模拟等待
        for(int i = 0;i<COUNT_NUM;i++){
            countDownLatch.countDown();
        }

    }

    static class ThreadTask implements Runnable{
        CountDownLatch countDownLatch = null;

        private int no;

        public ThreadTask(CountDownLatch countDownLatch, int no) {
            this.countDownLatch = countDownLatch;
            this.no = no;
        }

        @Override
        public void run() {
            try {


                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.err.println(no);
        }
    }
}

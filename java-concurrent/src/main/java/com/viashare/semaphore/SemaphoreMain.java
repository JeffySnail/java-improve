package com.viashare.semaphore;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

/**
 * Created by Jeffy on 16/01/11.
 */
public class SemaphoreMain {

    //尝试改变我试试
    private static final int count = 100;

    public static void main(String[] args) {


        //模拟最多10个线程能够访问
        Semaphore semaphore = new Semaphore(10);
        VisitedObj visitedObj = new VisitedObj(semaphore);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(count);
        for (int i = 0; i < count; i++) {
            new Thread(new ThreadTask(visitedObj, cyclicBarrier)).start();

        }
    }

    static class VisitedObj {

        private Semaphore semaphore;

        public VisitedObj(Semaphore semaphore) {
            this.semaphore = semaphore;
        }

        public void getProtectedIterm() throws InterruptedException {
            //get acquire
            semaphore.acquire();

            System.err.println("i have executed……");

//            semaphore.release();

        }
    }


    static class ThreadTask implements Runnable {

        private VisitedObj visitedObj;
        private CyclicBarrier cyclicBarrier;

        public ThreadTask(VisitedObj visitedObj, CyclicBarrier cyclicBarrier) {
            this.visitedObj = visitedObj;
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            try {
                visitedObj.getProtectedIterm();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

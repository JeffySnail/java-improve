package com.viashare.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Jeffy on 16/01/11.
 */
public class CyclicBarrierMain {

    private final static int NUM = 10;

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(NUM ,new BarrierAction());
        for (int i = 0; i < NUM; i++) {
            new Thread(new CyclicBarrierRunnable(cyclicBarrier,i)).start();

        }
        cyclicBarrier.reset();
    }


    static class CyclicBarrierRunnable implements Runnable {
        CyclicBarrier barrier1 = null;

        private int no = 0;

        public CyclicBarrierRunnable(CyclicBarrier barrier1, int no) {
            this.barrier1 = barrier1;
            this.no = no;
        }

        @Override
        public void run() {
            try {
                if(no == 2){
//                    int a = 8/0;
//                    barrier1.reset();
                }
                System.out.println(Thread.currentThread().getName() + " waiting at barrier 1");
                Thread.sleep(3000);
                System.err.println("waiting thread count is "+ barrier1.getNumberWaiting());


                this.barrier1.await();
                System.out.println(Thread.currentThread().getName() + " done!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();

            }

        }
    }

    static class BarrierAction implements  Runnable{

        @Override
        public void run() {
            System.err.println("the last thread has arrived");
        }
    }
}

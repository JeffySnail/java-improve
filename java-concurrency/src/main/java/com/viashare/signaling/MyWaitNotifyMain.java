package com.viashare.signaling;

/**
 * Created by Jeffy on 17/4/27.
 */
public class MyWaitNotifyMain {

    public static void main(String[] args) throws InterruptedException {
        MyWaitNotify myWaitNotify = new MyWaitNotify();
        Thread myThread11 = new Thread(new MyWaitNotifyMain.MyThread1(myWaitNotify));
        myThread11.start();

        Thread.sleep(5000);
        myWaitNotify.doNotify();

        Thread.sleep(5000);

        myWaitNotify.doNotify();
    }

    static class MyThread1 implements Runnable {

        private MyWaitNotify myWaitNotify;

        public MyThread1(MyWaitNotify myWaitNotify) {
            this.myWaitNotify = myWaitNotify;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    myWaitNotify.doWait();
                    Thread.currentThread().sleep(2000);
                    System.err.println("i am running");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package com.viashare.signaling;

/**
 * Created by Jeffy on 17/4/25.
 */
public class SignalMain {

    public static void main(String[] args) throws InterruptedException {
        MySignal mySignal = new MySignal();

        Thread myThread11 = new Thread(new MyThread1(mySignal));
        myThread11.start();

        Thread.sleep(5000);
        mySignal.setHasDataToProcess(true);

        Thread.sleep(5000);

        mySignal.setHasDataToProcess(false);

    }

    static class MyThread1 implements Runnable{

        private MySignal mySignal;

        public MyThread1(MySignal mySignal) {
            this.mySignal = mySignal;
        }

        @Override
        public void run() {
            while(true){
                try {

                    while(mySignal.isHasDataToProcess()){
                        Thread.currentThread().sleep(2000);
                        System.err.println("i am running");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

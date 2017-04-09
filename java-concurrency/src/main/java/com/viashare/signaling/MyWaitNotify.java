package com.viashare.signaling;

/**
 * Created by Jeffy on 17/4/9.
 */
public class MyWaitNotify {

    public static void main(String args[]) {
        Signal msg = new Signal();
        Consumer consumerA = new Consumer(msg);
        new Thread(consumerA, "consumerA").start();

//        Consumer consumerB = new Consumer(msg);
//        new Thread(consumerB, "consumerB").start();

        Producer producer = new Producer(msg);
        new Thread(producer, "producer").start();
        System.out.println("All the threads are started");
    }

    static class Consumer implements Runnable {
        private Signal msg = null;


        public Consumer(Signal msg) {
            this.msg = msg;
        }

        public void run() {
            String name = Thread.currentThread().getName();
            System.out.println(name + " started");
            synchronized (msg) {
                try{
                    System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
                    msg.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(name+" consumer thread got notified at time:"+System.currentTimeMillis());
                //process the message now
                System.out.println(name+" processed: "+msg.getMsg());
            }

        }
    }

    static class Producer implements Runnable {
        private Signal msg = null;


        public Producer(Signal msg) {
            this.msg = msg;
        }

        public void run() {
            String name = Thread.currentThread().getName();
            System.out.println(name+" started");
            try {
                Thread.sleep(1000);
                synchronized (msg) {
                    msg.setMsg(name+" producer work done");
                    msg.notify();
                    // msg.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //消息体
    static class Signal {
        private String msg;

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

}

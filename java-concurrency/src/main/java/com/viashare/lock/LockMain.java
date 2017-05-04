package com.viashare.lock;

/**
 * Created by Jeffy on 17/5/4.
 */
public class LockMain {


    public static void main(String[] args) throws InterruptedException {
        Lock lock = new Lock();
        new Thread(new MyThread(lock)).start();
        synchronized (lock) {
            lock.wait();
        }

        System.err.println("fuck the whole world");
    }

    static class Lock {

    }

    static class MyThread implements Runnable {

        private Lock lock;

        public MyThread(Lock lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            try {

                Thread.sleep(3000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock) {
                System.err.println("the lock is unlocked");
                lock.notify();
            }
        }
    }

}

package com.viashare.blockingqueue;

/**
 * Created by Jeffy on 17/5/8.
 */
public class QueueLock {


    public  synchronized void lock() throws InterruptedException {
        wait();
    }

    public synchronized void unLock(){
        notify();
    }
}

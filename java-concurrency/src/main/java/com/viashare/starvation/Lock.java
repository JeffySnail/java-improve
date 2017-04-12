package com.viashare.starvation;

/**
 * Created by Jeffy on 17/4/9.
 */
public class Lock {

    private boolean isLocked = false;

    private Thread lockingThread = null;

    public synchronized void lock() throws InterruptedException{
        while(isLocked){
            wait();
        }
        isLocked      = true;
        lockingThread = Thread.currentThread();
    }

    public synchronized void unLock(){
        if(this.lockingThread != Thread.currentThread()){
            throw new IllegalMonitorStateException(
                    "Calling thread has not locked this lock");
        }
        isLocked      = false;
        lockingThread = null;
        notify();
    }
}

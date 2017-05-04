package com.viashare.lock;

/**
 * Created by Jeffy on 17/5/4.
 */
public class Lock {

    private boolean isLocked = false;

    public synchronized void doLock() {
        while (isLocked) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isLocked = true;
    }

    public synchronized void unLock() {
        isLocked = false;
        notify();
    }
}

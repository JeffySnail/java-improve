package com.viashare.lock;

/**
 * Created by Jeffy on 17/5/4.
 */
public class Counter {
    Lock lock = new Lock();

    private int count;

    public int inc(){
        lock.doLock();
        int mycount = count++;
        lock.unLock();
        return mycount;
    }
}

package com.viashare.readwritelock;

/**
 * Created by Jeffy on 17/5/4.
 */
public class ReadWriteLock {

    private int readers = 0;

    private int writers = 0;

    private int writeRequset = 0;

    public synchronized void lockRead() throws InterruptedException {
        while (readers > 0 || writers > 0) {
            wait();
        }
        readers++;
    }

    public synchronized void unLockRead() {
        readers--;
        notifyAll();
    }

    public synchronized void lockWrite() throws InterruptedException {
        writeRequset++;
        while (readers > 0 || writers > 0) {
            wait();
        }
        writeRequset--;
        writers++;
    }

    public synchronized void unLockWrite() {
        writers--;
        notifyAll();
    }
}

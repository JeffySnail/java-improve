package com.viashare.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Jeffy on 17/5/8.
 */
public class BlockQueueMain {

    public static void main(String[] args) throws InterruptedException {
         QueueLock queueLock = new QueueLock();
        BlockingQueue blockingQueue = new ArrayBlockingQueue(1024);
        new Thread(new Consumer(blockingQueue,queueLock)).start();
        new Thread(new Producer(blockingQueue,queueLock)).start();
        Thread.currentThread().sleep(4000);
    }
}

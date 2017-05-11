package com.viashare.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Jeffy on 17/5/8.
 */
public class Producer implements Runnable{

    private BlockingQueue<String> queue;

    private QueueLock queueLock;

    public Producer(BlockingQueue<String> queue, QueueLock queueLock) {
        this.queue = queue;
        this.queueLock = queueLock;
    }

    public void run() {
        try {

            queue.put(null);
            Thread.sleep(1000);
            queue.put("1");
            Thread.sleep(1000);
            queue.put("2");
            Thread.sleep(1000);

        } catch (InterruptedException e) {

        }
    }
}

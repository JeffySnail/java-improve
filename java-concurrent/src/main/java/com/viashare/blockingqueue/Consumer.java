package com.viashare.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Jeffy on 17/5/8.
 */
public class Consumer implements Runnable {

    private BlockingQueue<String> queue;

    private QueueLock queueLock;

    public Consumer(BlockingQueue<String> queue, QueueLock queueLock) {

        this.queue = queue;
        this.queueLock = queueLock;
    }

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public synchronized void run() {
        try {
            while(true){
                String count = queue.take();
                System.err.println(count);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

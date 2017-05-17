package com.viashare.linkedblockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Jeffy on 15/12/11.
 */
public class LinkedBlockingQueueMain {

    public static void main(String[] args) throws InterruptedException {

        LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>(2);
        new Thread(new ProducerTask(linkedBlockingQueue)).start();
        new Thread(new ConsumerTask(linkedBlockingQueue)).start();
        Thread.currentThread().sleep(10000);
        System.err.println("finished");
    }

    static class ProducerTask implements Runnable {

        private BlockingQueue<String> queue;

        public ProducerTask(BlockingQueue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(2000);

                queue.put("name1");
                Thread.sleep(2000);
                queue.put("name2");
                Thread.sleep(2000);
                System.err.println(queue.offer("name3"));
                System.err.println(queue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class ConsumerTask implements Runnable {

        private BlockingQueue<String> queue;

        public ConsumerTask(BlockingQueue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                   String info =  queue.peek();
                    System.err.println(info);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }

}

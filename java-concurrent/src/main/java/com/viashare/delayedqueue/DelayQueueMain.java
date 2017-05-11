package com.viashare.delayedqueue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jeffy on 17/5/9.
 */
public class DelayQueueMain {

    public static void main(String[] args) throws InterruptedException {

        DelayQueue<DelayedElement> queue = new DelayQueue<DelayedElement>();

        DelayedElement element1 = new DelayedElement(3000);

        queue.put(element1);

        Delayed element2 = queue.take();
        System.err.println("结束"+element2.getDelay(TimeUnit.MILLISECONDS));

    }

//    static class Delayed
}

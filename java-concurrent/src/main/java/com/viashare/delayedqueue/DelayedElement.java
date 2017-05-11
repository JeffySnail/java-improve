package com.viashare.delayedqueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jeffy on 17/5/9.
 */
public class DelayedElement implements Delayed{

    private final static long now = System.currentTimeMillis();

    private long time ;

    public DelayedElement(long timeout) {
        this.time = now + timeout;
        System.err.println(now);
        System.err.println(time);
    }

    public long getDelay(TimeUnit unit) {
        long d = unit.convert( time-System.currentTimeMillis(),TimeUnit.MILLISECONDS);
        return d;
    }

    public int compareTo(Delayed o) {
        if(o == this){
            return 0;
        }
        if(o instanceof DelayedElement){
            DelayedElement x  = (DelayedElement) o;

        }
        return 0;
    }
}

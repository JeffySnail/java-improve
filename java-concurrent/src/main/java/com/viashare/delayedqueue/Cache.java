package com.viashare.delayedqueue;

import sun.jvm.hotspot.jdi.PrimitiveValueImpl;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jeffy on 17/5/11.
 */
public class Cache<K, E> {

    private ConcurrentHashMap<K, E> concurrentHashMap = new ConcurrentHashMap<K, E>();


    private DelayQueue<Iterm<Key>> delayQueue = new DelayQueue<>();

    public Cache() {
        Thread checkThread =  timeoutCheck();
        checkThread.setDaemon(true);
        checkThread.setName("cache daemon thread");
        checkThread.start();
        checkThread.setUncaughtExceptionHandler((t,e)->{
            System.err.println(t.getName()+" had died ");
            timeoutCheck().start();
            e.printStackTrace();
        });
    }

    private Thread timeoutCheck() {
        return new Thread(() -> {
            System.err.println("A thread has started");
            while (true) {
                try {
                    Iterm<Key> iterm =  delayQueue.take();
                    System.err.println("delayed queue has remove the timeout element [ " + iterm.getKey()+" ]");
                    concurrentHashMap.remove(iterm.getKey());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public E get(K key) {
        return concurrentHashMap.get(key);
    }


    public E put(K key, E value, long timeOut, TimeUnit timeUnit) {
        if (null == value) throw new IllegalArgumentException("value can not be null");

        delayQueue.put(new Iterm(key,timeOut));
        concurrentHashMap.put(key,value);
        return value;
    }


    static class Iterm<Key> implements Delayed {

        private static final long ORG_TIME = System.currentTimeMillis();

        private long triggerTime;

        private Key key;

        private long now() {
            return System.currentTimeMillis();
        }

        public Iterm(Key key, long timeout) {
            this.triggerTime = ORG_TIME + timeout;
            this.key = key;
        }

        public Key getKey() {
            return this.key;
        }

        public long getDelay(TimeUnit unit) {
            long d = unit.convert(triggerTime - now(), TimeUnit.MILLISECONDS);
            return d;
        }

        public int compareTo(Delayed o) {
            return 0;
        }
    }

    static class Key<K> {
        private K key;

        public Key(K key) {
            this.key = key;
        }
    }


}

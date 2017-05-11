package com.viashare.delayedqueue;

import java.util.concurrent.TimeUnit;

/**
 * Created by Jeffy on 17/5/11.
 */
public class CacheMain {

    public static void main(String[] args) throws InterruptedException {
        Cache cache = new Cache();
        cache.put("name","name",3000, TimeUnit.MILLISECONDS);
        Thread.sleep(1000);
        System.out.println(cache.get("name"));

        Thread.sleep(5000);
        System.out.println(cache.get("name"));

        System.err.println("finished........");

    }
}

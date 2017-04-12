package com.viashare.prototype;

/**
 * Created by Jeffy on 17/4/12.
 */
public class DemoMain {

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setName("name");
        worker.setSex("boy");
        Worker worker1 = (Worker) worker.clone();
        System.err.println(worker1.getName());
    }
}

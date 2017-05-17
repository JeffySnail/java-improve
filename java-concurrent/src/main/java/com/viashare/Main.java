package com.viashare;

/**
 * Created by Jeffy on 17/5/12.
 */
public class Main {


    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();

        thread.join();

        System.err.println("execute the method");
    }



}

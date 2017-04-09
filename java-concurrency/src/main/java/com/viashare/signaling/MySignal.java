package com.viashare.signaling;

/**
 * Created by Jeffy on 17/4/9.
 * Busy Wait module
 */
public class MySignal {

     private static boolean hasDataToProcess  = false;

    public static void main(String args[]){
        Thread listener = new Thread(new Listener());

        listener.start();
        System.err.println("listener has started");
    }
    static  class Listener implements Runnable{

        public void run() {
            while (hasDataToProcess){
                System.err.println( " i start to run");
                //do something
            }

        }
    }

    static  class Notifier implements Runnable{

        public void run() {
            //have done something notify all of listeners
            hasDataToProcess = true;

        }
    }
}

package com.viashare.signaling;

/**
 * Created by Jeffy on 17/4/9.
 */
public class MyWaitNotify {

    MonitorObject myMonitorObject = new MonitorObject();

    public void doWait(){
        synchronized(myMonitorObject){
            try{
                myMonitorObject.wait();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void doNotify(){
        synchronized(myMonitorObject){
            myMonitorObject.notify();
        }
    }

}

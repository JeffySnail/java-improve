package com.viashare.chain;

/**
 * Created by Jeffy on 17/4/13.
 */
public class TLWorker extends Worker{
    public void permit() {

        System.err.println("i am the TL ,I have permitted ");

        if(worker != null){
            worker.permit();
        }
    }
}

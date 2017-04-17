package com.viashare.chain;

/**
 * Created by Jeffy on 17/4/13.
 */
public class PMWorker extends Worker {
    public void permit() {

        System.err.println("i am the PM ,I have permitted ");
        if(worker != null){
            worker.permit();
        }
    }
}

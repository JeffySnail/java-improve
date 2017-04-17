package com.viashare.chain;

/**
 * Created by Jeffy on 17/4/13.
 */
public class DemoMain {

    public static void main(String[] args) {
        CEOWorker ceoWorker = new CEOWorker();
        PMWorker pmWorker = new PMWorker();
        TLWorker tlWorker = new TLWorker();
        tlWorker.setNext(pmWorker).setNext(ceoWorker);
        tlWorker.permit();
    }
}

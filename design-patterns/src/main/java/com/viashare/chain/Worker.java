package com.viashare.chain;

import java.util.TreeMap;

/**
 * Created by Jeffy on 17/4/13.
 */
public abstract class Worker {

    protected Worker worker;

    public abstract void permit();

    public Worker setNext(Worker next){
        this.worker = next;
        return next;
    }


}

package com.viashare.signaling;


import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by Jeffy on 17/4/9.
 * Busy Wait module
 */
public class MySignal {

    private boolean hasDataToProcess = false;

    public synchronized boolean isHasDataToProcess() {
        return this.hasDataToProcess;
    }

    public synchronized void setHasDataToProcess(boolean hasDataToProcess) {
        this.hasDataToProcess = hasDataToProcess;
    }
}

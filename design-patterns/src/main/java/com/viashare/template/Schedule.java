package com.viashare.template;

/**
 * Created by Jeffy on 17/4/15.
 */
public abstract class Schedule {

    protected  abstract void washFace();
    protected  abstract void lockSeat();
    protected  abstract void goToWork();

    protected void assign(){
        washFace();
        lockSeat();
        goToWork();
    }

}

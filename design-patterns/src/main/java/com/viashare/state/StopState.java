package com.viashare.state;

/**
 * Created by Jeffy on 17/4/14.
 */
public class StopState implements State{
    public void doAction(Context context) {
        System.out.println("I have stop the machine");
        context.setState(this);
    }
    public String toString(){
        return "Stop State";
    }
}

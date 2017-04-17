package com.viashare.state;

/**
 * Created by Jeffy on 17/4/14.
 */
public class StartState implements State{
    public void doAction(Context context) {
        System.err.println("i have started the machine");
        context.setState(this);
    }
    public String toString(){
        return "Start State";
    }
}

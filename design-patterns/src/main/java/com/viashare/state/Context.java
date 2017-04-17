package com.viashare.state;

/**
 * Created by Jeffy on 17/4/14.
 */
public class Context {

    private State state;

    public State getState() {

        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}

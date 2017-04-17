package com.viashare.strategy;

/**
 * Created by Jeffy on 17/4/15.
 */
public class Context {

    private Sign strategy;

    public Context(Sign strategy) {
        this.strategy = strategy;
    }

    public Sign getStrategy() {
        return strategy;
    }

    public void setStrategy(Sign strategy) {
        this.strategy = strategy;
    }

    public String operate(String str){
    return this.getStrategy().sign(str);
    }

}

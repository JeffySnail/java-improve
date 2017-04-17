package com.viashare.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeffy on 17/4/14.
 */
public class Tomcat {

    private boolean isStarted = false;

    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
        observers.clear();
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
        if(isStarted)
            notifyAllObservers();
    }
}

package com.viashare.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeffy on 17/4/14.
 */
public class CareTaker {


    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}

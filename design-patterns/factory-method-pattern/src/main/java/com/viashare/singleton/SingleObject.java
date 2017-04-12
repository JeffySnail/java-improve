package com.viashare.singleton;

/**
 * Created by Jeffy on 17/4/11.
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMsg(){
        System.err.println("我是单例的，我只有一个对象");
    }
}

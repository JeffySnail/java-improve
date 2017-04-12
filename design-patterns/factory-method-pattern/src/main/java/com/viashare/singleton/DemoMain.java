package com.viashare.singleton;

/**
 * Created by Jeffy on 17/4/11.
 */
public class DemoMain {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMsg();

    }
}

package com.viashare.factory;

/**
 * Created by Jeffy on 17/4/11.
 */
public class DemoMain {

    public static void main(String[] args) {
        Factory fc = new Factory();
        Sender sender = fc.produce("sms");
        sender.send();

    }
}

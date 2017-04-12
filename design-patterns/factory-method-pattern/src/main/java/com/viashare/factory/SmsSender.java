package com.viashare.factory;

/**
 * Created by Jeffy on 17/4/11.
 */
public class SmsSender implements Sender{

    public void send() {
        System.err.println("I am sms sender");
    }
}

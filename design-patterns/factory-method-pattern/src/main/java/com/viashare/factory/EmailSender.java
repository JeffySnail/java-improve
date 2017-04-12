package com.viashare.factory;

/**
 * Created by Jeffy on 17/4/11.
 */
public class EmailSender implements Sender {
    public void send() {
        System.err.println("i am a email sender");
    }
}

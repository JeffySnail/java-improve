package com.viashare.factory;

/**
 * Created by Jeffy on 17/4/11.
 */
public class Factory {

    public Sender produce(String sender){
        if("sms".equals(sender)){
            return new SmsSender();

        }else if("email".equals(sender)){
            return new EmailSender();
        }else{
            System.err.println(String.format("没有此中发送方式[%s]",sender));
            return null;
        }
    }
}

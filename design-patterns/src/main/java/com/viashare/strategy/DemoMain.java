package com.viashare.strategy;


/**
 * Created by Jeffy on 17/4/15.
 */
public class DemoMain {

    public static void main(String[] args) {
        Context context = null;
        context =  new Context(new MD5Sign());
        context.operate("str");

        context = new Context(new RSA2Sign());
        context.operate("str");

        context = new Context(new RSASign());
        context.operate("str");

    }
}

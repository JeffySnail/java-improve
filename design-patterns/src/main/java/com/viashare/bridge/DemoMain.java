package com.viashare.bridge;

/**
 * Created by Jeffy on 17/4/12.
 */
public class DemoMain {


    public static void main(String[] args) {
        PayService payService = new Alipay(new MD5Encrypt());
        payService.pay();
    }
}

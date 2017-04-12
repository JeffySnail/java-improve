package com.viashare.bridge;

/**
 * Created by Jeffy on 17/4/12.
 */
public class Alipay extends PayService {

    public Alipay(PayEncrypt payEncrypt) {
        super();
        super.payEncrypt = payEncrypt;

    }

    public boolean pay() {
        System.out.println("支付宝支付支付");
        payEncrypt.sign();
        return false;
    }
}

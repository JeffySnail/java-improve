package com.viashare.bridge;

/**
 * Created by Jeffy on 17/4/12.
 */
public class WechatPay  extends  PayService{

    public WechatPay(PayEncrypt payEncrypt) {
        super();
        super.payEncrypt = payEncrypt;

    }

    public boolean pay() {
        payEncrypt.sign();
        return false;
    }
}
